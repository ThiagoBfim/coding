package codewar.kyu.five;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ScrambliesTest {


    @Test
    public void test() {
       assertThat(Scramblies.scramble("rkqodlw","world")).isTrue();
       assertThat(Scramblies.scramble("cedewaraaossoqqyt","codewars")).isTrue();
       assertThat(Scramblies.scramble("katas","steak")).isFalse();
       assertThat(Scramblies.scramble("scriptjavx","javascript")).isFalse();
       assertThat(Scramblies.scramble("scriptingjava","javascript")).isTrue();
       assertThat(Scramblies.scramble("scriptsjava","javascripts")).isTrue();
       assertThat(Scramblies.scramble("javscripts","javascript")).isFalse();
       assertThat(Scramblies.scramble("aabbcamaomsccdd","commas")).isTrue();
       assertThat(Scramblies.scramble("commas","commas")).isTrue();
       assertThat(Scramblies.scramble("sammoc","commas")).isTrue();
    }
}
