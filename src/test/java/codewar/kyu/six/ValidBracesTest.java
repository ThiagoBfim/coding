package codewar.kyu.six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidBracesTest {

    private ValidBraces checker = new ValidBraces();

    @Test
    public void testValid() {
        assertEquals(true, checker.isValid("()"));
        assertEquals(true, checker.isValid("([]){}"));
    }

    @Test
    public void testInvalid() {
        assertEquals(false, checker.isValid(")"));
        assertEquals(false, checker.isValid("}"));
        assertEquals(false, checker.isValid("]"));
        assertEquals(false, checker.isValid("[(])"));
        assertEquals(false, checker.isValid("[][(])"));
        assertEquals(false, checker.isValid("[][()(])"));
        assertEquals(false, checker.isValid("()["));
    }
}
