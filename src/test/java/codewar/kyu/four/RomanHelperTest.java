package codewar.kyu.four;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RomanHelperTest {


    @Test
    public void testToRoman() throws Exception {
        assertThat(RomanHelper.toRoman(1)).isEqualTo("I");
        assertThat(RomanHelper.toRoman(2)).isEqualTo("II");
        assertThat(RomanHelper.toRoman(48)).isEqualTo("XLVIII");
        assertThat(RomanHelper.toRoman(88)).isEqualTo("LXXXVIII");
        assertThat(RomanHelper.toRoman(90)).isEqualTo("XC");
        assertThat(RomanHelper.toRoman(1450)).isEqualTo("MCDL");
        assertThat(RomanHelper.toRoman(3409)).isEqualTo("MMMCDIX");
    }

    @Test
    public void testFromRoman() throws Exception {
        assertThat(RomanHelper.fromRoman("I")).isEqualTo(1);
        assertThat(RomanHelper.fromRoman("II")).isEqualTo(2);
        assertThat(RomanHelper.fromRoman("XLVIII")).isEqualTo(48);
        assertThat(RomanHelper.fromRoman("LXXXVIII")).isEqualTo(88);
        assertThat(RomanHelper.fromRoman("XC")).isEqualTo(90);
    }
}
