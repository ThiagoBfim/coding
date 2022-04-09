package codewar.kyu.six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HumanReadableTimeTest {

    @Test
    void makeReadable() {
        assertEquals("00:00:00", HumanReadableTime.makeReadable(0), "makeReadable(0)");
        assertEquals("00:00:05", HumanReadableTime.makeReadable(5), "makeReadable(5)");
        assertEquals("00:01:00", HumanReadableTime.makeReadable(60), "makeReadable(60)");
        assertEquals("00:01:01", HumanReadableTime.makeReadable(61), "makeReadable(61)");
        assertEquals("00:01:40", HumanReadableTime.makeReadable(100), "makeReadable(100)");
        assertEquals("10:52:56", HumanReadableTime.makeReadable(39176), "makeReadable(39176)");
        assertEquals("23:59:59", HumanReadableTime.makeReadable(86399), "makeReadable(86399)");
        assertEquals("99:59:59", HumanReadableTime.makeReadable(359999), "makeReadable(359999)");
        assertEquals("23:59:58", HumanReadableTime.makeReadable(86398), "makeReadable(86398)");
        assertEquals("100:00:00", HumanReadableTime.makeReadable(360000), "makeReadable(360000)");
    }
}
