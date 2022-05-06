package codewar.kyu.six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DRootTest {

    @Test
    public void simpleTest() {
        assertEquals(7, DRoot.digitalRoot(16));
    }

    @Test
    public void testComplex() {
        assertEquals(6, DRoot.digitalRoot(456));
        assertEquals(6, DRoot.digitalRoot(942));
        assertEquals(6, DRoot.digitalRoot(132189));
        assertEquals(2, DRoot.digitalRoot(493193));
    }

    @Test
    public void testCleverSolution() {
        assertEquals(6, DRoot.digitalRootClever(456));
        assertEquals(6, DRoot.digitalRootClever(942));
        assertEquals(6, DRoot.digitalRootClever(132189));
        assertEquals(2, DRoot.digitalRootClever(493193));
    }
}
