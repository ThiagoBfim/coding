package codewar.kyu.six;

import java.util.ArrayList;
import java.util.List;

/**
 * Complete the solution so that it splits the string into pairs of two characters.
 * If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').
 */
public class SplitOddNumber {

    public static String[] solution(String s) {
        List<String> pairs = new ArrayList<>();
        var count = 0;
        var newPair = "";
        for (Character c : s.toCharArray()) {
            newPair = newPair.concat(c.toString());
            count++;
            if (count == 2) {
                count = 0;
                pairs.add(newPair);
                newPair = "";
            }
        }
        if(s.length() % 2 != 0){
            pairs.add(s.charAt(s.length() -1 ) + "_");
        }
        return pairs.toArray(new String[0]);
    }

    static String[] betterSolution(String s) {
        return (s + (s.length() % 2 > 0 ? "_" : "")).split("(?<=\\G.{2})");
    }

}
