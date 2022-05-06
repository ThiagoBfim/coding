package codewar.kyu.five;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PigLatinTest {

    @Test
    public void fixedTests() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
    }

    @Test
    public void singleWord() {
        assertEquals("igPay", PigLatin.pigIt("Pig"));
        assertEquals("igPay .", PigLatin.pigIt("Pig ."));
        assertEquals("baay !", PigLatin.pigIt("ab !"));
        assertEquals("baay ?", PigLatin.pigIt("ab ?"));
    }
}
