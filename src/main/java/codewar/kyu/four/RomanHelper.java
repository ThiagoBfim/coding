package codewar.kyu.four;

import java.util.Map;
import java.util.TreeMap;

public class RomanHelper {

    private static final Map<Integer, String> ROMAN_TABLE;

    static {
        TreeMap<Integer, String> treeMap = new TreeMap<>() {{
            put(1000, "M");
            put(900, "CM");
            put(500, "D");
            put(400, "CD");
            put(100, "C");
            put(90, "XC");
            put(50, "L");
            put(40, "XL");
            put(10, "X");
            put(9, "IX");
            put(5, "V");
            put(4, "IV");
            put(1, "I");
        }};
        ROMAN_TABLE = treeMap.descendingMap();
    }

    public static int fromRoman(String romanNumeral) {
        var result = 0;
        for (Map.Entry<Integer, String> entry : ROMAN_TABLE.entrySet()) {
            while (romanNumeral.startsWith(entry.getValue())) {
                result += entry.getKey();
                romanNumeral = romanNumeral.substring(entry.getValue().length());
            }
        }
        return result;
    }

    public static String toRoman(int value) {
        var builder = new StringBuilder();

        for (Map.Entry<Integer, String> entry : ROMAN_TABLE.entrySet()) {
            String romanNumber = entry.getValue();
            int number = entry.getKey();
            while (value >= number) {
                builder.append(romanNumber);
                value -= number;
            }
        }
        return builder.toString();
    }

}
