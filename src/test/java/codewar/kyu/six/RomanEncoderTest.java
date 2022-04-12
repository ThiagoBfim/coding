package codewar.kyu.six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanEncoderTest {

    private RomanEncoder conversion = new RomanEncoder();

    @Test
    public void shouldConvertToRoman() {
        assertEquals("I", conversion.solution(1), "solution(1) should equal to I" );
        assertEquals("IV", conversion.solution(4), "solution(4) should equal to IV");
        assertEquals("VI", conversion.solution(6), "solution(6) should equal to VI");
        assertEquals("VIII", conversion.solution(8), "solution(8) should equal to VIII");
    }


    @Test
    public void shouldConvertNumbersTwenty() {
        assertEquals("XX", conversion.solution(20));
        assertEquals("XXI", conversion.solution(21));
        assertEquals("XXII", conversion.solution(22));
        assertEquals("XXIII", conversion.solution(23));
        assertEquals("XXIV", conversion.solution(24));
        assertEquals("XXV", conversion.solution(25));
        assertEquals("XXVI", conversion.solution(26));
        assertEquals("XXVII", conversion.solution(27));
        assertEquals("XXVIII", conversion.solution(28));
        assertEquals("XXIX", conversion.solution(29));
        assertEquals("XXX", conversion.solution(30));
    }

    @Test
    public void shouldConvertComplexNumbersToRoman() {
        assertEquals("XLVIII", conversion.solution(48));
        assertEquals("LXXXVIII", conversion.solution(88));
        assertEquals("MMM", conversion.solution(3000));
        assertEquals("M", conversion.solution(1000));
        assertEquals("IX", conversion.solution(9));
        assertEquals("XXIX", conversion.solution(29));
        assertEquals("XL", conversion.solution(40));
        assertEquals("XLIX", conversion.solution(49));
        assertEquals("XCIX", conversion.solution(99));
        assertEquals("CDXC", conversion.solution(490));
    }
}
