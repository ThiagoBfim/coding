package codewar.kyu.seven;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FunListIndexOfTest {


    @Test
    public void basicTests() {
        assertEquals(-1, FunListIndexOf.indexOf(null, 17));
        assertEquals(-1, FunListIndexOf.indexOf(arrayToList(1, 2, 3), 5));
        assertEquals(1, FunListIndexOf.indexOf(arrayToList(1, 2, 3), 2));
        assertEquals(0, FunListIndexOf.indexOf(arrayToList("aaa", "b", "abc"), "aaa"));
        assertEquals(0, FunListIndexOf.indexOf(arrayToList(17, "17", 1.2), 17));
        assertEquals(1, FunListIndexOf.indexOf(arrayToList(17, "17", 1.2), "17"));
        assertEquals(2, FunListIndexOf.indexOf(arrayToList(1, 2, 3, 3), 3));
        assertEquals(2, FunListIndexOf.indexOf(arrayToList(1, 2, 3, 3, 3, 3, 3), 3));
    }

    private static FunListIndexOf.Node arrayToList(Object... array) {
        return array.length == 0 ? null : new FunListIndexOf.Node<>(array[0], arrayToList(Arrays.copyOfRange(array, 1, array.length)));
    }

}
