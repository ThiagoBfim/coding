package codewar.kyu.five;

import java.util.*;
import java.util.stream.IntStream;

/**
 * John and Mary want to travel between a few towns A, B, C ...
 * Mary has on a sheet of paper a list of distances between these towns. ls = [50, 55, 57, 58, 60].
 * John is tired of driving and he says to Mary that he doesn't want to drive more than t = 174 miles and he will visit only 3 towns.
 * <p>
 * Which distances, hence which towns, they will choose so that the sum of
 * the distances is the biggest possible to please Mary and John?
 */
public class BestTravel {

    public static Integer chooseBestSum(int value, int iterations, List<Integer> ls) {
        var data = new int[iterations];
        TreeSet<Integer> sums = new TreeSet<>();
        calculateSums(ls, iterations, 0, 0, sums, data);

        for (Integer v : sums.descendingSet()) {
            if (v <= value) {
                return v;
            }
        }
        return null;
    }

    private static void calculateSums(List<Integer> ls, int iterations, int start, int index, Set<Integer> sums, int[] data) {
        if (index == iterations) {
            sums.add(IntStream.of(data).sum());
            return;
        }
        for (int i = start; i < ls.size(); i++) {
            data[index] = ls.get(i);
            calculateSums(ls, iterations, i + 1, index + 1, sums, data);
        }
    }


}
