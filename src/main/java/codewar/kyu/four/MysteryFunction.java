package codewar.kyu.four;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MysteryFunction {

    /**
     * https://codereview.stackexchange.com/questions/184299/a-tiny-java-library-for-generating-gray-codes
     *
     * @param n
     * @return
     */
    static long grayCodeClever(long n) {
        return n ^ (n >>> 1);
    }

    /**
     * https://rosettacode.org/wiki/Gray_code#Java
     *
     * @param value
     * @return
     */
    static long grayCodeInvClever(long value) {
        long p = value;
        while ((value >>>= 1) != 0)
            p ^= value;
        return p;
    }

    private static List<StringBuilder> populateNumbers(long n) {
        List<StringBuilder> numbers = new LinkedList<>();
        do {
            populateNumbers(numbers);
        } while (numbers.size() <= n);
        return numbers;
    }

    /**
     * Return the value by position
     *
     * @param position
     * @return
     */
    public static long mystery(long position) {
        List<StringBuilder> numbers = populateNumbers(position);
        return Integer.parseInt(numbers.get((int) position).toString(), 2);
    }

    /**
     * Return the position by value
     *
     * @param value
     * @return
     */
    public static long mysteryInv(long value) {
        return findPositionByValue(value);
    }


    private static long findPositionByValue(long value) {
        List<StringBuilder> numbers = new ArrayList<>();
        do {
            int sizeElements = numbers.size();
            populateNumbers(numbers);
            if (sizeElements == 0) {
                Long position = findValue(value, numbers);
                if (position != null) return position;
            } else {
                Long position = findValue(value, numbers.subList(sizeElements, sizeElements * 2));
                if (position != null) return position + sizeElements;
            }

        } while (true);
    }


    private static void populateNumbers(List<StringBuilder> numbers) {
        if (numbers.isEmpty()) {
            numbers.add(new StringBuilder("0"));
            numbers.add(new StringBuilder("1"));
        } else {
            List<String> copyNumbers = numbers.stream().map(StringBuilder::toString).collect(Collectors.toList());
            numbers.forEach(number -> number.insert(0, "0"));
            for (int i = copyNumbers.size() - 1; i > -1; i--) {
                numbers.add(new StringBuilder("1").append(copyNumbers.get(i)));
            }
        }
    }

    private static Long findValue(long value, List<StringBuilder> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            var binary = Integer.parseInt(numbers.get(i).toString(), 2);
            if (binary == value) {
                return (long) i;
            }
        }
        return null;
    }

    public static String nameOfMystery() {
        return "gray code";
    }


}
