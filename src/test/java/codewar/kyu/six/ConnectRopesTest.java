package codewar.kyu.six;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ConnectRopesTest {

    @Test
    public void basicTests() {
        assertThat(ConnectRopes.addAll(new int[]{1, 2, 3})).isEqualTo(9);
        assertThat(ConnectRopes.addAll(new int[]{1, 2, 3, 4})).isEqualTo(19); //1+2=3 | 3+3 =6 | 6+4 =10 | 3+6+10=19
        assertThat(ConnectRopes.addAll(new int[]{1, 2, 3, 4, 5})).isEqualTo(33); //1+2=3 | 3+3 =6 | 4+5 =9 |9 + 6=15| 3+6+9+15=33
        assertThat(ConnectRopes.addAll(new int[]{29,6,18})).isEqualTo(77);//6+18=24 | 24+29 =53 | 53 + 24 = 77
        assertThat(ConnectRopes.addAll(new int[]{ 4, 3, 2, 6 })).isEqualTo(29);
        assertThat(ConnectRopes.addAll(new int[]{5, 4, 2, 8})).isEqualTo(36);
        assertThat(ConnectRopes.addAll(new int[]{8, 4, 6, 12})).isEqualTo(58);
    }
}
