package codewar.kyu.five;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GapInPrimesTest {

    @Test
    public void test() {
        assertEquals("[101, 103]", Arrays.toString(GapInPrimes.gap(2, 100, 110)));
        assertEquals("[103, 107]", Arrays.toString(GapInPrimes.gap(4, 100, 110)));
        assertEquals(null, GapInPrimes.gap(6, 100, 110));
        assertEquals("[359, 367]", Arrays.toString(GapInPrimes.gap(8, 300, 400)));
        assertEquals("[337, 347]", Arrays.toString(GapInPrimes.gap(10, 300, 400)));
    }

    @Test
    public void testBoundary(){
        assertEquals("[3, 5]", Arrays.toString(GapInPrimes.gap(2, 1, 5)));
        assertEquals("[1, 2]", Arrays.toString(GapInPrimes.gap(1, 1, 3)));
        assertEquals(null, GapInPrimes.gap(1, 1, 1));
        assertEquals("[1, 2]", Arrays.toString(GapInPrimes.gap(1, -1, 3)));
    }

    @Test
    public void testPerformance(){
        assertEquals("[31907, 31957]", Arrays.toString(GapInPrimes.gap(50, 1, 100000)));
        assertEquals("[404851, 404941]", Arrays.toString(GapInPrimes.gap(90, 1, 1000000)));
        assertEquals("[1468277, 1468387]", Arrays.toString(GapInPrimes.gap(110, 1000000, 2000000)));
    }

}
