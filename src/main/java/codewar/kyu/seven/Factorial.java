package codewar.kyu.seven;

public class Factorial {

    public static long factorial(int n) {
        long count = 1;
        while (n > 0) {
            count *= n;
            n--;
        }
        return count;
    }
}
