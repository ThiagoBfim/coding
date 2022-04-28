package codewar.kyu.seven;

public class Fibonacci {

    public static long fib(int n) {
        if (n <= 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    static long fibPerformance(int n) {
        long num1 = 0;
        long num2 = 1;

        for (int i = 1; i < n; i++) {
            long temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }

        return num2;
    }


}
