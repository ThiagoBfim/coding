package codewar.kyu.five;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FibNumbersTest {

    @Test
    public void test1() {
        long[] r = new long[] {55, 89, 1};
        assertArrayEquals(r, FibNumbers.productFib(4895));
    }

    @Test
    public void test2() {
        long[] r = new long[] {89, 144, 0};
        assertArrayEquals(r, FibNumbers.productFib(5895));
    }

    @Test
    public void test3() {
        long[] r = new long[] {1, 1, 1};
        assertArrayEquals(r, FibNumbers.productFib(1));
    }
}
