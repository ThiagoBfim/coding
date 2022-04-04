package codewar.kyu.five;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesTest {

    @Test
    public void sampleTest() {
        assertTrue(ValidParentheses.validParentheses("()"));
        assertFalse(ValidParentheses.validParentheses("())"));
        assertTrue(ValidParentheses.validParentheses("32423(sgsdg)"));
        assertFalse(ValidParentheses.validParentheses("(dsgdsg))2432"));
        assertTrue(ValidParentheses.validParentheses("adasdasfa"));
    }
    @Test
    public void complexTest() {
        assertFalse(ValidParentheses.validParentheses(")(()))"));
        assertFalse(ValidParentheses.validParentheses("("));
        assertFalse(ValidParentheses.validParentheses("())("));
        assertFalse(ValidParentheses.validParentheses(")()("));
        assertTrue(ValidParentheses.validParentheses("(())((()())())"));
        assertTrue(ValidParentheses.validParentheses("(())"));

    }
}
