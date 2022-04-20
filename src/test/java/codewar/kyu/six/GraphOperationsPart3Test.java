package codewar.kyu.six;

import codewar.kyu.six.GraphOperationsPart3.Graph;
import codewar.kyu.six.GraphOperationsPart3.Vertex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GraphOperationsPart3Test {


    Graph exampleGraph;
    Vertex[] V = new Vertex[]{new Vertex(), new Vertex(), new Vertex(), new Vertex(), new Vertex(), new Vertex()};

    @BeforeEach
    public void setUpSmallExampleGraph(){
        exampleGraph = new Graph();
        /*
         *      V[2] - V[0] - V[3] - V[4]    V[5]
         *              |       |
         *             V[1] - - -
         */
        exampleGraph.addEdges(V[0], V[1], V[0], V[2], V[0], V[3], V[1], V[3], V[3], V[4]);
        exampleGraph.addVertex(V[5]);
    }

    private Set<Vertex> createDepartment(Vertex... vertices){
        Set<Vertex> department = new HashSet<>();
        department.addAll(Arrays.asList(vertices));
        return department;
    }

    @Test
    public void exampleTests(){
        //Department of V[1] and V[2] is not connected to the department of V[4] and V[5]
        assertEquals(0, GraphOperationsPart3.departmentConnections(exampleGraph, createDepartment(V[1], V[2]), createDepartment(V[4], V[5])));

        //Department of V[0], V[1] and V[2] is connected to the department of V[3] and V[4] 2 times: V[0]-V[3] and V[1]-V[3]
        assertEquals(2, GraphOperationsPart3.departmentConnections(exampleGraph, createDepartment(V[0], V[1], V[2]), createDepartment(V[3], V[4])));

        //Department of V[1], V[2] and V[3] is connected to the department of V[0] 3 times: V[1]-V[0], V[2]-V[0] and V[3]-V[0]
        assertEquals(3, GraphOperationsPart3.departmentConnections(exampleGraph, createDepartment(V[1], V[2], V[3]), createDepartment(V[0])));
    }
}
