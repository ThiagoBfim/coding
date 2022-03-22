package codewar.kyu.five;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        var fullString = new StringBuilder(str1);
        for (char letter : str2.toCharArray()) {
            int index = fullString.indexOf(String.valueOf(letter));
            if (index < 0) {
                return false;
            } else {
                fullString.deleteCharAt(index);
            }
        }
        return true;
    }
}
