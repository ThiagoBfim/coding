package codewar.kyu.six;


public class Diamond {

    public static String printClever(int n) {
        if (n % 2  == 0 || n <= 0) {return null;}
        var expected = new StringBuilder();
        for (int i = 1; i <= n; i+=2) {
            expected.append(" ".repeat((n - i) / 2)).append("*".repeat(i)).append("\n");
        }
        for (int i = n - 2; i >= 1; i-=2) {
            expected.append(" ".repeat((n - i) / 2)).append("*".repeat(i)).append("\n");
        }
        return expected.toString();
    }

    public static String print(int n) {
        if (n <= 0 || n % 2 == 0) {
            return null;
        }

        var diamond = new StringBuilder();
        int spaces = n / 2;
        for (int i = 1; i <= n; i += 2) {
            diamond.append(sumCharacters(spaces, " "))
                    .append(sumCharacters(i, "*"))
                    .append("\n");
            spaces--;
        }
        var lastSpace = 1;
        for (int i = n - 2; i >= 1; i -= 2) {
            diamond.append(sumCharacters(lastSpace, " "))
                    .append(sumCharacters(i, "*"))
                    .append("\n");
            lastSpace++;
        }

        return diamond.toString();
    }


    private static String sumCharacters(int numberSpaces, String character) {
        if (numberSpaces <= 0) {
            return "";
        }
        return new String(new char[numberSpaces]).replace("\0", character);
    }

}
