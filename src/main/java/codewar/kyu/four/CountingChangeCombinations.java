package codewar.kyu.four;


import java.util.List;

/**
 * Write a function that counts how many different ways you can make change for an amount of money, given an array of coin denominations.
 * For example, there are 3 ways to give change for 4 if you have coins with denomination 1 and 2:
 * <code>1+1+1+1, 1+1+2, 2+2.</code>
 */
public class CountingChangeCombinations {

    public static int count(int money, List<Integer> coins) {
        if (money < 0 || coins.isEmpty()) {
            return 0;
        }
        if (money == 0) {
            return 1;
        }

        return count(money - coins.get(0), coins) + count(money, coins.subList(1, coins.size()));
    }

}
