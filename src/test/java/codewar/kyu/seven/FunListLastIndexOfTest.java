package codewar.kyu.seven;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FunListLastIndexOfTest {


    @Test
    public void basicTests() {
        assertEquals(-1, FunListLastIndexOf.lastIndexOf(null, 17));
        assertEquals(0, FunListLastIndexOf.lastIndexOf(arrayToList(1, 2, 3), 1));
        assertEquals(1, FunListLastIndexOf.lastIndexOf(arrayToList(1, 2, 3), 2));
        assertEquals(0, FunListLastIndexOf.lastIndexOf(arrayToList("aaa", "b", "abc"), "aaa"));
        assertEquals(0, FunListLastIndexOf.lastIndexOf(arrayToList(17, "17", 1.2), 17));
        assertEquals(1, FunListLastIndexOf.lastIndexOf(arrayToList(17, "17", 1.2), "17"));
        assertEquals(3, FunListLastIndexOf.lastIndexOf(arrayToList(1, 2, 3, 3), 3));
        assertEquals(6, FunListLastIndexOf.lastIndexOf(arrayToList(1, 2, 3, 3, 3, 3, 3), 3));

    }


    private static FunListLastIndexOf.Node arrayToList(Object... array) {
        return array.length == 0 ? null : new FunListLastIndexOf.Node<>(array[0], arrayToList(Arrays.copyOfRange(array, 1, array.length)));
    }
}
