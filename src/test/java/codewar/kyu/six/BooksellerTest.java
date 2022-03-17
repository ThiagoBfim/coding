package codewar.kyu.six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BooksellerTest {

    @Test
    public void test1() {
        String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String cd[] = new String[] {"A", "B"};
        assertEquals("(A : 200) - (B : 1140)",
                Bookseller.stockSummary(art, cd));
    }

    @Test
    public void test2() {
        String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "ABAR 600"};
        String cd[] = new String[] {"A", "B", "Q"};
        assertEquals("(A : 800) - (B : 1140) - (Q : 0)",
                Bookseller.stockSummary(art, cd));
    }

    @Test
    public void test3() {
        String art[] = new String[]{"CBAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "ABAR 600"};
        String cd[] = new String[] {"A", "B", "C"};
        assertEquals("(A : 600) - (B : 1140) - (C : 700)",
                Bookseller.stockSummary(art, cd));
    }

    @Test
    public void test4() {
        String art[] = new String[]{"CBAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "ABAR 600"};
        String cd[] = new String[0];
        assertEquals("",
                Bookseller.stockSummary(art, cd));
    }
    @Test
    public void test5() {
        String art[] = new String[]{};
        String cd[] = new String[] {"A", "B", "C"};
        assertEquals("",
                Bookseller.stockSummary(art, cd));
    }

    @Test
    public void test6() {
        String art[] = new String[]{"ROXANNE 102", "RHODODE 123", "BKWRKAA 125", "BTSQZFG 239", "DRTYMKH 060"};
        String cd[] = new String[] {"B", "R", "D", "X"};
        assertEquals("(B : 364) - (R : 225) - (D : 60) - (X : 0)",
                Bookseller.stockSummary(art, cd));
    }
}
