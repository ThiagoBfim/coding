package codewar.kyu.five;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Dec2FactTest {

    @Test
    public void testDecimal() {
        // 463 ÷ 1 = 463, remainder 0 | 463 ÷ 2 = 231, remainder 1 |231 ÷ 3 = 77, remainder 0 |77 ÷ 4 = 19, remainder 1 |19 ÷ 5 = 3, remainder 4 |3 ÷ 6 = 0, remainder 3
        assertEquals( "341010", Dec2Fact.dec2FactString(463L));
        assertEquals("1212210", Dec2Fact.dec2FactString(1001L));
        assertEquals( "10", Dec2Fact.dec2FactString(1L));
        assertEquals( "0", Dec2Fact.dec2FactString(0L));
        assertEquals( "100", Dec2Fact.dec2FactString(2L));
        assertEquals( "9876543210", Dec2Fact.dec2FactString(3628799L));
        assertEquals( "1000000000000000", Dec2Fact.dec2FactString(1307674368000L));
    }

    @Test
    public void testBigNumbers() {
        assertEquals(3628799L, Dec2Fact.factString2Dec("9876543210"));
        assertEquals( "9876543210", Dec2Fact.dec2FactString(3628799L));

        assertEquals(3628800L, Dec2Fact.factString2Dec("A000000000"));
        assertEquals( "10000000000", Dec2Fact.dec2FactString(3628800L));

        assertEquals(1234567890L, Dec2Fact.factString2Dec("26A2116333000"));
        assertEquals( "26A2116333000", Dec2Fact.dec2FactString(1234567890L));

    }
    @Test
    public void testFacToString() {
        assertEquals(463L, Dec2Fact.factString2Dec("341010")); //((((3×5 + 4)×4 + 1)×3 + 0)×2 + 1)×1 + 0
        assertEquals(1001L, Dec2Fact.factString2Dec("1212210"));
        assertEquals(1L, Dec2Fact.factString2Dec("10"));
        assertEquals(0L, Dec2Fact.factString2Dec("0"));
        assertEquals(2L, Dec2Fact.factString2Dec("100"));
        assertEquals(10695261968250L, Dec2Fact.factString2Dec("8297294729215999"));
        assertEquals(1307674368000L, Dec2Fact.factString2Dec("1000000000000000"));
    }
}
