package codewar.kyu.four;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MysteryFunctionTest {

    @Test
    public void mystery() {
        assertEquals(0, MysteryFunction.grayCodeClever(0));
        assertEquals(1, MysteryFunction.grayCodeClever(1));
        assertEquals(3, MysteryFunction.grayCodeClever(2));
        assertEquals(2, MysteryFunction.grayCodeClever(3));
        assertEquals(5, MysteryFunction.grayCodeClever(6));
        assertEquals(13, MysteryFunction.grayCodeClever(9));
        assertEquals(26, MysteryFunction.grayCodeClever(19));
    }

    @Test
    public void mysteryInv() {
        assertEquals(0, MysteryFunction.grayCodeInvClever(0));
        assertEquals(1, MysteryFunction.grayCodeInvClever(1));
        assertEquals(6, MysteryFunction.grayCodeInvClever(5));
        assertEquals(9, MysteryFunction.grayCodeInvClever(13));
        assertEquals(19, MysteryFunction.grayCodeInvClever(26));
        assertEquals(800, MysteryFunction.grayCodeInvClever(688));
        assertEquals(688, MysteryFunction.grayCodeInvClever(1000));
        assertEquals(689, MysteryFunction.grayCodeInvClever(1001));
        assertEquals(66752, MysteryFunction.grayCodeInvClever(100000));
        assertEquals(129153, MysteryFunction.grayCodeInvClever(66753));
    }

    @Test
    public void nameOfMystery() {
        assertEquals("gray code", MysteryFunction.nameOfMystery());
    }

    @Test
    public void mysteryBig() {
        assertEquals(1655351978, MysteryFunction.grayCodeClever(1127428915));
        assertEquals(50331648, MysteryFunction.grayCodeClever(33554432));
        assertEquals(1610612736, MysteryFunction.grayCodeClever(1073741824));
        assertEquals(51539607552L, MysteryFunction.grayCodeClever(34359738368L));
        assertEquals(824633720832L, MysteryFunction.grayCodeClever(549755813888L));
    }

    @Test
    public void mysteryBigInv() {
        assertEquals(2097151, MysteryFunction.grayCodeInvClever(1048576));
        assertEquals(67108863, MysteryFunction.grayCodeInvClever(33_554_432));
        assertEquals(2147483647, MysteryFunction.grayCodeInvClever(1073741824));
        assertEquals(1127428915, MysteryFunction.grayCodeInvClever(1655351978));
        assertEquals(34359738368L, MysteryFunction.grayCodeInvClever(51539607552L));
        assertEquals(549755813888L, MysteryFunction.grayCodeInvClever(824633720832L));

    }
}
