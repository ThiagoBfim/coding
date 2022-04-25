package codewar.kyu.six;

public class PlayPass {

    public static String playPass(String s, int n) {
        var result = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            String transformed = transform(n, c, i % 2 != 0);

            if (i % 2 != 0) {
                transformed = transformed.toLowerCase();
            }
            result.append(transformed);
        }
        return result.reverse().toString();
    }

    private static String transform(int n, char c, boolean isEven) {
        if (c >= 48 && c <= 57) {
            int value = Math.abs(c - 48 - 9);
            return Character.toString(value + 48);
        }
        if (c >= 65 && c <= 90) {
            return lowercaseEachLetterAndShift(n, c, isEven);
        }
        return Character.toString(c);
    }

    private static String lowercaseEachLetterAndShift(int n, char c, boolean isEven) {
        String result;
        if (c + n > 90) {
            result = Character.toString(64 + (c + n - 90));
        } else {
            result = Character.toString(c + n);
        }
        return isEven ? result.toLowerCase() : result;
    }


}
