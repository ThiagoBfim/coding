package codewar.kyu.seven;

/**
 * i) If a = 0 or b = 0, return [a,b]. Otherwise, go to step (ii);
 * ii) If a ≥ 2*b, set a = a - 2*b, and repeat step (i). Otherwise, go to step (iii);
 * iii) If b ≥ 2*a, set b = b - 2*a, and repeat step (i). Otherwise, return [a,b].
 */
public class Recursion101 {

    public static int[] solve(int a, int b) {
        if (stepOne(a, b)) return new int[]{a, b};
        if (stepTwo(a, b)) return solve(a - 2 * b, b);
        if (stepThree(a, b)) return solve(a, b - 2 * a);
        return new int[]{a, b};
    }

    private static boolean stepThree(int a, int b) {
        return b >= 2 * a;
    }

    private static boolean stepTwo(int a, int b) {
        return a >= 2 * b;
    }

    private static boolean stepOne(int a, int b) {
        return a == 0 || b == 0;
    }


}
