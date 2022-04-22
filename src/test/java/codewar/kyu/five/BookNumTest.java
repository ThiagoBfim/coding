package codewar.kyu.five;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookNumTest {

    @Test
    public void testOneDigit() {
        assertEquals(4, BookNum.pageDigits(4));
        assertEquals(9, BookNum.pageDigits(9));
    }

    @Test
    public void testTwoDigit() {
        assertEquals(15, BookNum.pageDigits(12)); //for 1-9, plus 2 each for 10, 11, 12
        assertEquals(31, BookNum.pageDigits(20)); //9 + 11*2
        assertEquals(189, BookNum.pageDigits(99)); //9 + 90*2
    }

    @Test
    public void testThreeDigit() {
        assertEquals(192, BookNum.pageDigits(100)); //9 + 90*2 + 3 = 192
        assertEquals(207, BookNum.pageDigits(105)); //9 + 90*2 + 5*3 = 204
    }

    @Test
    public void testBigNumber() {
        assertEquals(3488888898L, BookNum.pageDigits(400_000_000L));
    }

    @Test
    public void testOtherBigNumber() {
        assertEquals(4688888888901L, BookNum.pageDigits(400_000_000_000L));
    }

    @Test
    public void testReallyBigNumber() {
        //99_999_999_999_999_999
        assertEquals(7088888888888888907L, BookNum.pageDigits(400_000_000_000_000_000L));
    }
}
