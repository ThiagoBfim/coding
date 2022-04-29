package codewar.kyu.seven;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.stream.LongStream;

import static codewar.kyu.seven.Factorial.factorial;

class FactorialTest {

    @Test
    void test() {
        Assertions.assertThat(factorial(0)).isEqualTo(1L);
        Assertions.assertThat(factorial(1)).isEqualTo(1L);
        Assertions.assertThat(factorial(4)).isEqualTo(24L);
        Assertions.assertThat(factorial(7)).isEqualTo(5040L);
    }

    @Test
    void randomTest() {
        Random rng = new Random();
        for (int i = 0; i < 100; i++) {
            int n = rng.nextInt(17);
            long factorial = LongStream.rangeClosed(1, n)
                    .reduce(1, (long x, long y) -> x * y);
            Assertions.assertThat(factorial(n)).isEqualTo(factorial);
        }
    }

}
