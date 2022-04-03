package codewar.kyu.six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DateByDayTest {

    @Test
    void basicTest() {
        assertEquals("January, 1", DateByDay.getDay(1, false));
        assertEquals("January, 15", DateByDay.getDay(15, false));
        assertEquals("February, 10", DateByDay.getDay(41, false));
        assertEquals("February, 28", DateByDay.getDay(59, false));
        assertEquals("March, 1", DateByDay.getDay(60, false));
        assertEquals("February, 29", DateByDay.getDay(60, true));
        assertEquals("December, 1", DateByDay.getDay(335, false));
        assertEquals("December, 31", DateByDay.getDay(365, false));
        assertEquals("December, 31", DateByDay.getDay(366, true));
    }
}
