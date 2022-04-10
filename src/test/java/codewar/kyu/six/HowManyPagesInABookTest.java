package codewar.kyu.six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HowManyPagesInABookTest {

    @Test
    public void testSample() {
        assertEquals(  0, HowManyPagesInABook.amountOfPages(0));
        assertEquals(  1, HowManyPagesInABook.amountOfPages(1));
        assertEquals(  5, HowManyPagesInABook.amountOfPages(5));
        assertEquals( 17, HowManyPagesInABook.amountOfPages(25)); //1234567891011121314151617
        assertEquals( 20, HowManyPagesInABook.amountOfPages(31)); //1234567891011121314151617181920
        assertEquals(401, HowManyPagesInABook.amountOfPages(1095));
        assertEquals( 97, HowManyPagesInABook.amountOfPages(185));
        assertEquals(256, HowManyPagesInABook.amountOfPages(660));
        assertEquals(22222, HowManyPagesInABook.amountOfPages(100_000));
    }
}
