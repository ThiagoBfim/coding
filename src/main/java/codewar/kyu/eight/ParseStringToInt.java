package codewar.kyu.eight;

public class ParseStringToInt {

    public static int howOld(final String herOld) {
        return Integer.parseInt(herOld.replaceAll("[^\\d.]", ""));
    }

}
