package codewar.kyu.six;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').
 */
class SplitOddNumberTest {

    @Test
    public void testEvenString() {
        String s = "abcdef";
        String s1 = "HelloWorld";
        assertEquals("[ab, cd, ef]", Arrays.toString(SplitOddNumber.solution(s)));
        assertEquals("[He, ll, oW, or, ld]", Arrays.toString(SplitOddNumber.solution(s1)));
    }

    @Test
    public void testOddString() {
        String s = "abcde";
        String s1 = "LovePizza";
        assertEquals("[ab, cd, e_]", Arrays.toString(SplitOddNumber.solution(s)));
        assertEquals("[Lo, ve, Pi, zz, a_]", Arrays.toString(SplitOddNumber.solution(s1)));
    }
}
