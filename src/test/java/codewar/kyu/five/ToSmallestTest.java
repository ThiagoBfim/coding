package codewar.kyu.five;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ToSmallestTest {

    private static void testing(long n, String res) {
        assertEquals(res,
                Arrays.toString(ToSmallest.smallest(n)));
    }

    @Test
    public void test() {
        System.out.println("Basic Tests smallest");
        testing(261235, "[126235, 2, 0]");
        testing(209917, "[29917, 0, 1]");
        testing(285365, "[238565, 3, 1]");
        testing(269045, "[26945, 3, 0]");
        testing(296837, "[239687, 4, 1]");
        testing(123456, "[123456, 0, 0]");
    }

    @Test
    public void testBigNumbers() {
        testing(319917, "[131997, 4, 0]");
        testing(199819884756L, "[119989884756, 4, 0]");
//        testing(910416310733594880L, "[10416310733594889, 0, 17]");
    }

    @Test
    public void testZeroValues() {

        testing(94883608842L, "[9488368842, 6, 0]"); //04883698842L
        testing(639363524731180928L, "[63936352473118928, 14, 0]");
        testing(238640003005671296L, "[23864000305671296, 9, 0]");
        testing(935855753L, "[358557539, 0, 8]");
        testing(325920108686957120L, "[32592010868695712, 17, 0]");
    }

}
