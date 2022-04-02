package codewar.kyu.eight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParseStringToIntTest {

    @Test
    public void test1() {
        assertEquals(5, ParseStringToInt.howOld("5 years old"));
    }

    @Test
    public void test2() {
        assertEquals(9, ParseStringToInt.howOld("9 years old"));
    }

    @Test
    public void test3() {
        assertEquals(1, ParseStringToInt.howOld("1 year old"));
    }
}
