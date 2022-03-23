package codewar.kyu.five;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class PaginationHelperTest {

    @Test
    void testPaginationHelperWithCharacter() {
        PaginationHelper<Character> helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        assertThat(helper.pageCount()).isEqualTo(2); //should == 2
        assertThat(helper.itemCount()).isEqualTo(6); //should == 6
        assertThat(helper.pageItemCount(0)).isEqualTo(4); //should == 4
        assertThat(helper.pageItemCount(1)).isEqualTo(2); // last page - should == 2
        assertThat(helper.pageItemCount(2)).isEqualTo(-1); // should == -1 since the page is invalid

        assertThat(helper.pageIndex(5)).isEqualTo(1); //should == 1 (zero based index)
        assertThat(helper.pageIndex(2)).isZero(); //should == 0
        assertThat(helper.pageIndex(20)).isEqualTo(-1); //should == -1
        assertThat(helper.pageIndex(-10)).isEqualTo(-1); //should == -1
    }

    @Test
    void testBigPaginationHelper() {
        List<Integer> elements = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());

        PaginationHelper<Integer> helper = new PaginationHelper<>(elements, 10);
        assertThat(helper.pageCount()).isEqualTo(10); //should == 10
        assertThat(helper.itemCount()).isEqualTo(100); //should == 100
        assertThat(helper.pageItemCount(0)).isEqualTo(10); //should == 10
        assertThat(helper.pageItemCount(1)).isEqualTo(10); // last page - should == 10
        assertThat(helper.pageItemCount(20)).isEqualTo(-1); // should == -1 since the page is invalid

        assertThat(helper.pageIndex(11)).isEqualTo(1); //should == 1 (zero based index)
        assertThat(helper.pageIndex(80)).isEqualTo(8); //should == 8
        assertThat(helper.pageIndex(-10)).isEqualTo(-1); //should == -1
        assertThat(helper.pageIndex(2)).isZero(); //should == 0
        assertThat(helper.pageIndex(0)).isZero(); //should == 0
        assertThat(helper.pageIndex(1)).isZero(); //should == 0
    }

    @Test
    void testPageItemCount() {
        List<Integer> elements = IntStream.rangeClosed(0, 99).boxed().collect(Collectors.toList());

        PaginationHelper<Integer> helper = new PaginationHelper<>(elements, 9);
        assertThat(helper.pageCount()).isEqualTo(12);
        assertThat(helper.pageItemCount(20)).isEqualTo(-1);
        assertThat(helper.pageItemCount(11)).isEqualTo(1);
        assertThat(helper.pageItemCount(10)).isEqualTo(9);
        assertThat(helper.pageItemCount(1)).isEqualTo(9);
        assertThat(helper.pageItemCount(3)).isEqualTo(9);
        assertThat(helper.pageItemCount(-1)).isEqualTo(-1);
        assertThat(helper.pageItemCount(0)).isEqualTo(9);
    }

    @Test
    void testPageIndex() {
        List<Integer> elements = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());

        PaginationHelper<Integer> helper = new PaginationHelper<>(elements, 10);

        assertThat(helper.pageIndex(-1)).isEqualTo(-1);
        assertThat(helper.pageIndex(-10)).isEqualTo(-1);
        assertThat(helper.pageIndex(101)).isEqualTo(-1);
        assertThat(helper.pageIndex(99)).isEqualTo(9);
        assertThat(helper.pageIndex(11)).isEqualTo(1);
        assertThat(helper.pageIndex(71)).isEqualTo(7);
        assertThat(helper.pageIndex(2)).isZero();
        assertThat(helper.pageIndex(0)).isZero();
        assertThat(helper.pageIndex(1)).isZero();
    }

    @Test
    void testPageWithoutElements() {
        PaginationHelper<Character> helper = new PaginationHelper<>(new ArrayList<>(), 4);
        assertThat(helper.pageCount()).isZero();
        assertThat(helper.itemCount()).isZero();
        assertThat(helper.pageItemCount(0)).isZero();
        assertThat(helper.pageItemCount(1)).isEqualTo(-1);
        assertThat(helper.pageItemCount(2)).isEqualTo(-1);

        assertThat(helper.pageIndex(0)).isEqualTo(-1);
        assertThat(helper.pageIndex(1)).isEqualTo(-1);
        assertThat(helper.pageIndex(20)).isEqualTo(-1);
        assertThat(helper.pageIndex(-10)).isEqualTo(-1);
    }


}
