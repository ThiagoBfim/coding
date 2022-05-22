package codewar.kyu.seven;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FunListMatchTest {


    @Test
    public void basicTests() {
        assertEquals(false, FunListMatch.anyMatch(null, __ -> false));
        assertEquals(false, FunListMatch.anyMatch(null, __ -> true));
        assertEquals(true, FunListMatch.allMatch(null, __ -> false));
        assertEquals(true, FunListMatch.allMatch(null, __ -> true));
    }

    @Test
    public void arrayOfInts() {
        assertEquals(true, FunListMatch.anyMatch(arrayToList(1, 2, 3), x -> Integer.parseInt(x.toString()) > 1));
        assertEquals(false, FunListMatch.allMatch(arrayToList(1, 2, 3), x -> Integer.parseInt(x.toString()) > 1));
    }
    private static FunListMatch.Node arrayToList(Object... array) {
        return array.length == 0 ? null : new FunListMatch.Node<>(array[0], arrayToList(Arrays.copyOfRange(array, 1, array.length)));
    }
}
