package codewar.kyu.five;

import java.math.BigInteger;
import java.util.stream.LongStream;

import static java.lang.Math.sqrt;

public class FactDecomp {

    public static String decomp(int n) {
        BigInteger factorial = LongStream.rangeClosed(1, n)
                .parallel()
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
        var result = new StringBuilder();

        var count = 1;

        while (factorial.compareTo(BigInteger.ZERO) > 0) {
            var nextPrime = nextPrime(count);
            count = nextPrime;
            factorial = decomp(factorial, result, BigInteger.valueOf(nextPrime));
            if (factorial == null || factorial.compareTo(BigInteger.ONE) <= 0) break;
        }

        return result.toString().substring(0, result.length() - 3);
    }

    private static BigInteger decomp(BigInteger factorial, StringBuilder result, BigInteger prime) {
        var count = 0;
        while (factorial.mod(prime).equals(BigInteger.ZERO)) {
            factorial = factorial.divide(prime);
            count++;
        }
        if (count > 1) {
            result.append(String.format("%d^%d * ", prime, count));
        }
        if (count == 1) {
            result.append(String.format("%d * ", prime));
        }
        if (factorial.equals(BigInteger.ZERO)) {
            return null;
        }
        return factorial;
    }

    public static int nextPrime(int input) {
        int counter;
        input++;
        while (true) {
            int l = (int) sqrt(input);
            counter = 0;
            for (int i = 2; i <= l; i++) {
                if (input % i == 0) counter++;
            }
            if (counter == 0)
                return input;
            else {
                input++;
            }
        }
    }

    public static String decompClever(int n) {
        int[] exponentsOfPrimes = new int[n+1];
        while (n>1) {
            int x = n--;
            for (int i=2; i<=Math.sqrt(x); i++)
                if (x % i == 0) {
                    x /= i;
                    exponentsOfPrimes[i]++;
                    i = 1;
                }
            exponentsOfPrimes[x]++;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 2; i < exponentsOfPrimes.length; i++) {
            if (exponentsOfPrimes[i] == 0) continue;
            if (exponentsOfPrimes[i] == 1) result.append(i + " * ");
            if (exponentsOfPrimes[i] >  1) result.append(i + "^" + exponentsOfPrimes[i] + " * ");
        }
        return result.substring(0,result.length()-3);
    }
}
