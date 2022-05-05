package codewar.kyu.four;

import codewar.kyu.four.SortBinaryTree.Node;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortBinaryTreeTest {

    @Test
    public void nullTest() {
        assertEquals(Arrays.asList(), SortBinaryTree.treeByLevels(null));
    }

    @Test
    public void basicTest() {
        //      1
        //  2       3
        //4        5    6
        //                7
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7), SortBinaryTree.treeByLevels(
                new Node(new Node(null, new Node(null, null, 4), 2),
                        new Node(new Node(null, null, 5),
                                new Node(null, new Node(null, null, 7), 6),
                                3),
                        1)));
    }
}
