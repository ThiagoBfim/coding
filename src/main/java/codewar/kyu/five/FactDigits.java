package codewar.kyu.five;

public class FactDigits {

    public static int factDigits(int n) {
        double count = 0;
        for (var i = 1; i <= n; i++) {
            count += Math.log10(i);
        }
        return (int) (Math.floor(count)) + 1;
    }
}
