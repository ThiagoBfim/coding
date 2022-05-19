package codewar.kyu.seven;

import codewar.kyu.seven.FunListLength.Node;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FunListLengthTest {

    @Test
    public void basicTests() {
        assertEquals(0, FunListLength.length(null));
        assertEquals(4, FunListLength.length(arrayToList(new int[]{1, 2, 3, 4})));
        assertEquals(11, FunListLength.length(arrayToList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11})));
        assertEquals(195, FunListLength.lengthClever(arrayToList(new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13
        })));
    }

    private static Node<Integer> arrayToList(int[] array) {
        return array.length == 0 ? null : new Node<>(array[0], arrayToList(Arrays.copyOfRange(array, 1, array.length)));
    }
}
