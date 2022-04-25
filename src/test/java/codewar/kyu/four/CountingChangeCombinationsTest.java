package codewar.kyu.four;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CountingChangeCombinationsTest {

    @Test
    void test() {
        Assertions.assertThat(CountingChangeCombinations.count(4, Arrays.asList(1, 2))).isEqualTo(3);
        Assertions.assertThat(CountingChangeCombinations.count(10, Arrays.asList(5, 2, 3))).isEqualTo(4);
        Assertions.assertThat(CountingChangeCombinations.count(11, Arrays.asList(5, 7))).isZero();
        Assertions.assertThat(CountingChangeCombinations.count(11, Arrays.asList(5, 1))).isEqualTo(3);
        Assertions.assertThat(CountingChangeCombinations.count(12, Arrays.asList(1, 2, 3))).isEqualTo(19);
    }

    @Test
    public void testSimple() {
        assertEquals(3, CountingChangeCombinations.count(4, Arrays.asList(1, 2)));
    }

    @Test
    public void testAnother() {
        assertEquals(4, CountingChangeCombinations.count(10, Arrays.asList(5,2,3)));
    }

    @Test
    public void testNoChange() {
        assertEquals(0, CountingChangeCombinations.count(11, Arrays.asList(5,7)));
    }

    @Test
    public void test1() {
        assertEquals(1022, CountingChangeCombinations.count(300, Arrays.asList(5,10,20,50,100,200,500)));
    }

    @Test
    public void test2() {
        assertEquals(1022, CountingChangeCombinations.count(300, Arrays.asList(500,5,50,100,20,200,10)));
    }

    @Test
    public void test3() {
        assertEquals(0, CountingChangeCombinations.count(301, Arrays.asList(5,10,20,50,100,200,500)));
    }

    @Test
    public void test4() {
        assertEquals(760, CountingChangeCombinations.count(199, Arrays.asList(3,5,9,15)));
    }

    @Test
    public void test5() {
        assertEquals(19, CountingChangeCombinations.count(98, Arrays.asList(3,14,8)));
    }

    @Test
    public void test6() {
        assertEquals(18515, CountingChangeCombinations.count(419, Arrays.asList(2,5,10,20,50)));
    }
}
