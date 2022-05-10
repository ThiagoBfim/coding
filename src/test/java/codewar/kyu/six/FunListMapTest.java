package codewar.kyu.six;

import codewar.kyu.six.FunListMap.Node;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FunListMapTest {

    // testMap(input_list_head, mapping_function, expected_list_head)

    @Test
    public void basicTests() {
        testMap(null, __ -> false, null);

        Function<Integer, Integer> f = x -> x * 2;
        testMap(new Node(1, new Node(2, new Node(3))), f, new Node(2, new Node(4, new Node(6))));
    }

    private static <T, R> void testMap(Node<T> head, Function<T, R> f, Node<R> expected) {
        assertArrayEquals(listToArray(expected), listToArray(FunListMap.map(head, f)));
    }

    private static Node<Integer> arrayToList(int[] array) {
        return array.length == 0 ? null : new Node<>(array[0], arrayToList(Arrays.copyOfRange(array, 1, array.length)));
    }

    private static <T> Object[] listToArray(Node<T> head) {
        Collection<T> values = new LinkedList<>();
        for (; head != null; head = head.next) values.add(head.data);
        return values.toArray();
    }
}
