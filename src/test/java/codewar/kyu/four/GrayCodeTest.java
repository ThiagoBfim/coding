package codewar.kyu.four;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GrayCodeTest {

    @Test
    public void mystery() {
        assertEquals(0, GrayCode.grayCodeClever(0));
        assertEquals(1, GrayCode.grayCodeClever(1));
        assertEquals(3, GrayCode.grayCodeClever(2));
        assertEquals(2, GrayCode.grayCodeClever(3));
        assertEquals(5, GrayCode.grayCodeClever(6));
        assertEquals(13, GrayCode.grayCodeClever(9));
        assertEquals(26, GrayCode.grayCodeClever(19));
    }

    @Test
    public void mysteryInv() {
        assertEquals(0, GrayCode.grayCodeInvClever(0));
        assertEquals(1, GrayCode.grayCodeInvClever(1));
        assertEquals(6, GrayCode.grayCodeInvClever(5));
        assertEquals(9, GrayCode.grayCodeInvClever(13));
        assertEquals(19, GrayCode.grayCodeInvClever(26));
        assertEquals(800, GrayCode.grayCodeInvClever(688));
        assertEquals(688, GrayCode.grayCodeInvClever(1000));
        assertEquals(689, GrayCode.grayCodeInvClever(1001));
        assertEquals(66752, GrayCode.grayCodeInvClever(100000));
        assertEquals(129153, GrayCode.grayCodeInvClever(66753));
    }

    @Test
    public void nameOfMystery() {
        assertEquals("gray code", GrayCode.nameOfMystery());
    }

    @Test
    public void mysteryBig() {
        assertEquals(1655351978, GrayCode.grayCodeClever(1127428915));
        assertEquals(50331648, GrayCode.grayCodeClever(33554432));
        assertEquals(1610612736, GrayCode.grayCodeClever(1073741824));
        assertEquals(51539607552L, GrayCode.grayCodeClever(34359738368L));
        assertEquals(824633720832L, GrayCode.grayCodeClever(549755813888L));
    }

    @Test
    public void mysteryBigInv() {
        assertEquals(2097151, GrayCode.grayCodeInvClever(1048576));
        assertEquals(67108863, GrayCode.grayCodeInvClever(33_554_432));
        assertEquals(2147483647, GrayCode.grayCodeInvClever(1073741824));
        assertEquals(1127428915, GrayCode.grayCodeInvClever(1655351978));
        assertEquals(34359738368L, GrayCode.grayCodeInvClever(51539607552L));
        assertEquals(549755813888L, GrayCode.grayCodeInvClever(824633720832L));

    }
}
