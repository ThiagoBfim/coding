package codewar.kyu.six;

import codewar.kyu.six.FunListFilter.Node;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FunListFilterTest {


    @Test
    public void basicTests() {
        testFilter(null, __ -> false, null);
        testFilter(new Node<>(1, new Node<>(2, new Node<>(3))), x -> true, new Node<>(1, new Node<>(2, new Node<>(3))));
    }

    @Test
    public void arrayOfInts() {
        testFilter(new Node<>(1, new Node<>(2, new Node<>(3))), x -> Integer.parseInt(x.toString()) <= 2, new Node<>(1, new Node<>(2)));
        testFilter(new Node<>(1, new Node<>(2, new Node<>(3))), x -> Integer.parseInt(x.toString()) == 1, new Node<>(1));
    }

    public static void testFilter(Node inputListHead, Predicate predicate, Node expectedResult) {
        assertEquals(expectedResult, FunListFilter.filter(inputListHead, predicate));
    }
}
