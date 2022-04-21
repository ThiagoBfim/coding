package codewar.kyu.four;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


class CountingChangeCombinationsTest {

    @Test
    void test() {
        Assertions.assertThat(CountingChangeCombinations.count(4, Arrays.asList(1, 2))).isEqualTo(3);
        Assertions.assertThat(CountingChangeCombinations.count(10, Arrays.asList(5, 2, 3))).isEqualTo(4);
        Assertions.assertThat(CountingChangeCombinations.count(11, Arrays.asList(5, 7))).isZero();
        Assertions.assertThat(CountingChangeCombinations.count(11, Arrays.asList(5, 1))).isEqualTo(3);
        Assertions.assertThat(CountingChangeCombinations.count(12, Arrays.asList(1, 2, 3))).isEqualTo(19);
    }
}
