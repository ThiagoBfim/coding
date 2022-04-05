package codewar.kyu.four;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MysteryFunctionTest {

    @Test
    public void mystery() {
        assertEquals(0, MysteryFunction.mystery(0), "mystery(0) ");
        assertEquals(1, MysteryFunction.mystery(1), "mystery(1) ");
        assertEquals(3, MysteryFunction.mystery(2), "mystery(2) ");
        assertEquals(2, MysteryFunction.mystery(3), "mystery(3) ");
        assertEquals(5, MysteryFunction.mystery(6), "mystery(6) ");
        assertEquals(13, MysteryFunction.mystery(9), "mystery(9) ");
        assertEquals(26, MysteryFunction.mystery(19), "mystery(19)");
    }

    @Test
    public void mysteryInv() {
        assertEquals(0, MysteryFunction.mysteryInv(0), "mysteryInv(0)");
        assertEquals(1, MysteryFunction.mysteryInv(1), "mysteryInv(1)");
        assertEquals(6, MysteryFunction.mysteryInv(5), "mysteryInv(5)");
        assertEquals(9, MysteryFunction.mysteryInv(13), "mysteryInv(13)");
        assertEquals(19, MysteryFunction.mysteryInv(26), "mysteryInv(26)");
    }

    @Test
    public void nameOfMystery() {
        assertEquals( "gray code", MysteryFunction.nameOfMystery());

    }

}
