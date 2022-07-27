package codewar.kyu.seven;

public class Palindromes {

    public static int palindromeChainLength(long n) {
        return palindromeChainLength(n, 0);
    }

    private static int palindromeChainLength(long n, int count) {
        if (isPalindrome(n)) {
            return count;
        } else {
            long sum = n + getReverseNumber(n);
            return palindromeChainLength(sum, ++count);
        }
    }

    private static boolean isPalindrome(long sum) {
        return getReverseNumber(sum).equals(sum);
    }

    private static Long getReverseNumber(long n) {
        String reverseNumber = new StringBuilder().append(n).reverse().toString();
        return Long.valueOf(reverseNumber);
    }

}


