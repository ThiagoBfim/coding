package codewar.kyu.six;

import codewar.kyu.six.GraphOperationsPart2.Graph;
import codewar.kyu.six.GraphOperationsPart2.Vertex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GraphOperationsPart2Test {
    Graph exampleGraph;
    Vertex[] V = new Vertex[]{new Vertex(), new Vertex(), new Vertex(), new Vertex(), new Vertex(), new Vertex(), new Vertex()};

    @BeforeEach
    public void setUpSmallExampleGraph() {
        exampleGraph = new Graph();
        /*
         *      V[2] - V[0] - V[3] - V[4]  -  V[5]
         *              |       |
         *             V[1] -
         *              |
         *             V[6]
         */
        exampleGraph.addEdges(V[0], V[1], V[1], V[6], V[0], V[2], V[0], V[3], V[1], V[3], V[3], V[4], V[4], V[5], V[6], V[5]);
        exampleGraph.addVertex(V[6]);
    }

    @Test
    public void testHopDistanceExample() {
        assertEquals(1, GraphOperationsPart2.hopDistance(exampleGraph, V[0], V[1]));
        assertEquals(3, GraphOperationsPart2.hopDistance(exampleGraph, V[2], V[4]));
        assertEquals(3, GraphOperationsPart2.hopDistance(exampleGraph, V[4], V[2]));
        assertEquals(2, GraphOperationsPart2.hopDistance(exampleGraph, V[4], V[1]));
        assertEquals(3, GraphOperationsPart2.hopDistance(exampleGraph, V[0], V[5]));
        assertEquals(3, GraphOperationsPart2.hopDistance(exampleGraph, V[5], V[0]));
    }
}
