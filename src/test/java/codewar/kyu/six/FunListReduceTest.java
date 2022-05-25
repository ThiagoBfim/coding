package codewar.kyu.six;

import codewar.kyu.six.FunListReduce.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FunListReduceTest {

    @Test
    public void basicTests() {
        assertEquals(0, (int) FunListReduce.reduce(null, Integer::sum, 0));
        assertEquals(6, (int) FunListReduce.reduce(
                new Node<>(1,
                        new Node<>(2,
                                new Node<>(3)
                        )
                ), Integer::sum, 0)
        );
        assertEquals(24, (int) FunListReduce.reduce(
                new Node<>(1,
                        new Node<>(2,
                                new Node<>(3,
                                        new Node<>(4)
                                )
                        )
                ), (a, b) -> a * b, 1)
        );
    }

    @Test
    public void testWithString() {
        assertEquals("abc", FunListReduce.reduce(
                new Node<>("a",
                        new Node<>("b",
                                new Node<>("c")
                        )
                ), (a, b) -> a + b, "")
        );
    }
}
