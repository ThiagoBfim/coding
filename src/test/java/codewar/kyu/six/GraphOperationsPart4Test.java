package codewar.kyu.six;


import codewar.kyu.six.GraphOperationsPart4.Graph;
import codewar.kyu.six.GraphOperationsPart4.Vertex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GraphOperationsPart4Test {


    Vertex[] V = new Vertex[]{new Vertex(), new Vertex(), new Vertex(), new Vertex(), new Vertex(), new Vertex()};

    @Test
    public void shouldReturnTrueForConnectedGraph() {
        Graph graph = new Graph();
        /*
         *      V[2] - V[0] - V[3] - V[4]
         *              |       |
         *             V[1] - - -
         */
        graph.addEdges(V[0], V[1], V[0], V[2], V[0], V[3], V[1], V[3], V[3], V[4]);

        assertTrue(GraphOperationsPart4.isConnected(graph));
    }

    @Test
    public void shouldReturnFalseForGraphWithIsolatedVertex() {
        Graph graph = new Graph();
        /*
         *      V[2] - V[0] - V[3] - V[4]    V[5]
         *              |       |
         *             V[1] - - -
         */
        graph.addEdges(V[0], V[1], V[0], V[2], V[0], V[3], V[1], V[3], V[3], V[4]);
        graph.addVertex(V[5]);

        assertFalse(GraphOperationsPart4.isConnected(graph));
    }

    @Test
    public void shouldReturnFalseForNotConnectedGraphWithoutIsolatedVertex() {
        Graph graph = new Graph();

        /*
         *      V[2] - V[0]      V[3] - V[4]
         *              |          |      |
         *             V[1]      V[5] - - -
         */
        graph.addEdges(V[0], V[1], V[0], V[2], V[3], V[4], V[4], V[5], V[3], V[5]);

        assertFalse(GraphOperationsPart4.isConnected(graph));
    }

    @Test
    public void shouldReturnTrueForConnectedGraphSeparated() {
        Graph graph = new Graph();

        /*
         *      V[2] - V[0]      V[3] - V[4]
         *       -      |          |      |
         *       -     V[1]      V[5] - - -
         *       - - - - - -- - --
         */
        graph.addEdges(V[0], V[1], V[3], V[5], V[3], V[4], V[4], V[5], V[0], V[2], V[2], V[5]);

        assertTrue(GraphOperationsPart4.isConnected(graph));
    }

    @Test
    public void shouldReturnFalse() {
        Graph graph = new Graph();

        /*
         *      V[2] - V[0]      V[3] - V[4]
         *       -      |          |      |
         *       -     V[1]      V[5] - - -
         *       - - - - - -- - --
         */
        graph.addEdges(V[0], V[1]);
        graph.addVertex(V[2]);


        assertFalse(GraphOperationsPart4.isConnected(graph));
    }

    @Test
    public void shouldReturnTrueForEmptyGraph() {
        assertTrue(GraphOperationsPart4.isConnected(new Graph()));
    }
}
