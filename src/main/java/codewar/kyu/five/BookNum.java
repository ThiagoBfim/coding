package codewar.kyu.five;

public class BookNum {

    public static long pageDigits(long pages) {

        long rTotal = 0;
        long count = pages;
        do {
            if (count <= 9) {
                rTotal += count;
                break;
            } else {
                long lenght = String.valueOf(count).length();
                long multiply = count - Long.parseLong("9".repeat((int) (lenght - 1)));
                rTotal += lenght * multiply;
                count -= multiply;
            }
        } while (count >= 1);


        return rTotal;
    }

    public static long pageDigitsClever(long pages) {
        long k = 0, i = 1;
        while (i <= pages) {
            k += pages - i + 1;
            i *= 10;
        }
        return k;
    }

}
