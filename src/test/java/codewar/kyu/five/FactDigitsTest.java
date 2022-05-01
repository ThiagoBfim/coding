package codewar.kyu.five;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactDigitsTest {

    @Test
    void tests() {
        assertEquals(1, FactDigits.factDigits(0));
        assertEquals(1, FactDigits.factDigits(1));
        assertEquals(1, FactDigits.factDigits(3));
        assertEquals(7, FactDigits.factDigits(10));
        assertEquals(8, FactDigits.factDigits(11));
        assertEquals(1911, FactDigits.factDigits(777));
        assertEquals(2568, FactDigits.factDigits(1000));
        assertEquals(26884, FactDigits.factDigits(7777));
        assertEquals(35660, FactDigits.factDigits(10000));
        assertEquals(346621, FactDigits.factDigits(77777));
        assertEquals(4243991, FactDigits.factDigits(777777));
    }
}
