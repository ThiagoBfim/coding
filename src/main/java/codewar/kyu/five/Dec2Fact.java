package codewar.kyu.five;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Dec2Fact {

    public static String dec2FactString(long nb) {
        List<Character> factorial = factorial(nb);
        String collect = factorial.stream().map(String::valueOf)
                .collect(Collectors.joining(""));
        return new StringBuilder(collect).reverse().toString();
    }

    private static List<Character> factorial(long nb) {
        List<Character> result = new ArrayList<>();
        long number = nb;
        long count = 1;
        while (true) {
            long division = number % count;
            number = number / count;
            count++;
            if (division > 9) {
                char value = (char) (65 + division - 10);
                result.add(value);
            } else {
                char value = (char) (division + 48);
                result.add(value);
            }
            if (number == 0) {
                return result;
            }
        }
    }

    public static long factString2Dec(String str) {
        int length = str.length();
        long result = 0;
        int count = 0;
        for (int i = length - 1; i > 0; i--) {
            if (i == length - 1) {
                result += i * getValue(str, count) + getValue(str, count + 1);
            } else {
                result = result * i + getValue(str, count + 1);
            }
            count++;
        }
        return result;
    }

    private static int getValue(String str, int count) {
        if (str.charAt(count) < 64) {
            return str.charAt(count) - 48;
        } else {
            return str.charAt(count) - 55;
        }
    }

}
