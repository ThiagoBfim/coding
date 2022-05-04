package codewar.kyu.four;

import java.math.BigInteger;
import java.util.TreeSet;

/**
 * This is a very simply formulated task. Let's call an integer number N 'green' if N² ends with all of the digits of N
 *
 * Not Solved
 */
public class GreenNumbers {


    public static BigInteger get(int n) {
        if (n == 1) {
            return BigInteger.ONE;
        }

        TreeSet<BigInteger> treeSet = new TreeSet<>();
        addNumber(treeSet, n + n / 5);
        BigInteger[] bigIntegers = treeSet.toArray(new BigInteger[]{});
        return bigIntegers[n - 2];
    }

    public static void addNumber(TreeSet<BigInteger> treeSet, int number) {
        var digitNo = 2;
        var counter = 2;
        var num = BigInteger.valueOf(5);
        treeSet.add(num);
        var num2 = BigInteger.valueOf(6);
        treeSet.add(num2);
        while (counter < number) {
            BigInteger numSquared = num.multiply(num);
            BigInteger powOfTen = BigInteger.TEN.pow(digitNo);
            num = numSquared.mod(powOfTen);
            num2 = powOfTen.add(BigInteger.ONE).subtract(num);
            treeSet.add(num);
            treeSet.add(num2);
            counter += 2;
            digitNo++;
        }
    }
}
