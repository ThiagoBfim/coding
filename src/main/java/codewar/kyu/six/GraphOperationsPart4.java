package codewar.kyu.six;

import java.util.*;
import java.util.stream.Collectors;

public class GraphOperationsPart4 {


    public static int hopDistance(Vertex source, Vertex target, Map<Vertex, Set<Vertex>> hopes) {
        if (hopes.containsKey(source)) {
            return hopes.get(source).contains(target) ? 1 : 0;
        }
        return 1;
    }


    public static void hopes(Map<Vertex, Set<Vertex>> mapVertex, Vertex source, Map<Vertex, Set<Vertex>> hopes) {
        Set<Vertex> visitedVertexes = new HashSet<>();
        Set<Vertex> freshlyVisited = new HashSet<>();

        visitedVertexes.add(source);
        freshlyVisited.add(source);
        var distance = 0;
        while (true) {
            freshlyVisited = freshlyVisited.stream()
                    .flatMap(v -> mapVertex.get(v).stream())
                    .filter(v -> !visitedVertexes.contains(v))
                    .collect(Collectors.toSet());
            visitedVertexes.addAll(freshlyVisited);
            distance++;
            if (distance > visitedVertexes.size()) {
                hopes.put(source, visitedVertexes);
                return;
            }
        }
    }

    public static boolean isConnected(Graph graph) {

        Map<Vertex, Set<Vertex>> mapVertex = new HashMap<>();
        Map<Vertex, Set<Vertex>> hopes = new HashMap<>();

        for (Edge ed : graph.getEdges()) {
            var v1 = ed.getV1();
            var v2 = ed.getV2();
            mapVertex.computeIfAbsent(v1, v -> new HashSet<>()).add(v2);
            mapVertex.computeIfAbsent(v2, v -> new HashSet<>()).add(v1);
        }

        if (graph.getVertices().size() > mapVertex.size()) {
            return false;
        }

        graph.getVertices().parallelStream()
                .forEach(v -> hopes(mapVertex, v, hopes));

        List<Edge> edges = new ArrayList<>(graph.getEdges());

        for (int i = 0; i < edges.size() - 1; i++) {
            Edge edge = edges.get(i);
            Edge edge2 = edges.get(i + 1);

            int distance = hopDistance(edge.getV1(), edge2.getV1(), hopes);
            if (distance > 0) {
                continue;
            }
            distance += hopDistance(edge.getV1(), edge2.getV2(), hopes);
            if (distance <= 0) {
                return false;
            }

        }
        return true;
    }

    static class Graph {
        private static int uidCounter = 0;
        Set<Vertex> vertices;
        Set<Edge> edges;

        public Graph() {
            vertices = new HashSet<>();
            edges = new HashSet<>();
        }

        public void addVertex(Vertex vertex) {
            vertices.add(vertex);
        }

        public void addVertices(Vertex... vertices) {
            for (Vertex v : vertices)
                addVertex(v);
        }

        public void addEdge(Vertex v1, Vertex v2) {
            addEdge(new Edge(v1, v2));
        }

        public void addEdge(Edge edge) {
            vertices.add(edge.v1);
            vertices.add(edge.v2);
            edges.add(edge);
        }

        public void addEdges(Vertex... vertices) {
            if (vertices.length % 2 != 0)
                throw new IllegalArgumentException();

            for (int i = 0; i < vertices.length; i = i + 2) {
                addEdge(vertices[i], vertices[i + 1]);
            }
        }

        public Set<Vertex> getVertices() {
            return vertices;
        }

        public Set<Edge> getEdges() {
            return edges;
        }

        static int getUidForNode() {
            return uidCounter++;
        }
    }

    static class Vertex {
        private final int uid;

        Vertex() {
            uid = Graph.getUidForNode();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Vertex other = (Vertex) o;
            return uid == other.uid;
        }

        @Override
        public int hashCode() {
            return uid;
        }
    }

    static class Edge {
        Vertex v1;
        Vertex v2;

        Edge(Vertex v1, Vertex v2) {
            this.v1 = v1;
            this.v2 = v2;
        }

        public Vertex getV1() {
            return v1;
        }

        public Vertex getV2() {
            return v2;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Edge other = (Edge) o;
            return (v1.equals(other.v1) && v2.equals(other.v2)) || (v1.equals(other.v2) && v2.equals(other.v1));
        }

        @Override
        public int hashCode() {
            return v1.hashCode() + v2.hashCode();
        }
    }
}
