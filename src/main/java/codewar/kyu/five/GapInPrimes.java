package codewar.kyu.five;

import java.util.ArrayList;
import java.util.List;

public class GapInPrimes {

    public static long[] gap(int gap, long first, long last) {
        List<Integer> primes = new ArrayList<>();
        primes.add(1);
        var count = (int) first;
        while (count <= last) {
            var prime = isPrime(count);
            if (prime) {
                primes.add(count);
            }
            count++;
        }

        for (var i = 0; i < primes.size() - 1; i++) {
            var currentPrime = primes.get(i);
            if (currentPrime >= first) {
                var nextPrime = primes.get(i + 1);
                if (nextPrime - currentPrime == gap) {
                    return new long[]{currentPrime, nextPrime};
                }
            }
        }

        return null;
    }

    private static boolean isPrimeWorseWay(long last, long count) {
        long count2 = 2;
        while (count2 <= last) {
            if (count != count2 && count % count2 == 0) {
                return false;
            }
            count2++;
        }
        return true;
    }

    /**
     * Better way, better performance
     *
     * @param n interger value
     * @return
     */
    static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        long sqrtN = (long) Math.sqrt(n) + 1;
        for (long i = 6L; i <= sqrtN; i += 6) {
            if (n % (i - 1) == 0 || n % (i + 1) == 0) return false;
        }
        return true;
    }
}
