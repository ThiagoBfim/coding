package codewar.kyu.seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

    @Test
    void sampleTests() {
        assertEquals(1, Fibonacci.fib(1), "fib(1)");
        assertEquals(1, Fibonacci.fib(2), "fib(2)");
        assertEquals(2, Fibonacci.fib(3), "fib(3)");
        assertEquals(3, Fibonacci.fib(4), "fib(4)");
        assertEquals(5, Fibonacci.fib(5), "fib(5)");
        assertEquals(8, Fibonacci.fib(6), "fib(8)");
        assertEquals(13, Fibonacci.fib(7), "fib(13)");
        assertEquals(317811, Fibonacci.fibPerformance(28), "fib(28)");
        assertEquals(267914296, Fibonacci.fibPerformance(42), "fib(42)");
        assertEquals(12586269025L, Fibonacci.fibPerformance(50), "fib(50)");
    }
}
