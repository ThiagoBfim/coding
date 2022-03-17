package codewar.kyu.six;

import java.util.*;
import java.util.stream.Stream;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.*;

/**
 * 6 kyu - Help the bookseller !
 * <p>
 * A bookseller has lots of books classified in 26 categories labeled A, B, ... Z. Each book has a code c of 3, 4, 5 or more characters.
 * The 1st character of a code is a capital letter which defines the book category.
 * <p>
 * In the bookseller's stocklist each code c is followed by a space and by a positive integer n (int n >= 0)
 * which indicates the quantity of books of this code in stock.
 */

public class Bookseller {

    // 1st parameter is the stocklist (L in example),
    // 2nd parameter is list of categories (M in example)
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOf1stLetter.length == 0 || lstOfArt.length == 0) {
            return "";
        }

        Map<String, Integer> categoriesQuantity = new LinkedHashMap<>();

        Stream.of(lstOf1stLetter).map(s -> s.replaceAll("\\[|]", ""))
                .forEach(c -> categoriesQuantity.put(c, 0));

        Stream.of(lstOfArt).map(s -> s.replaceAll("\\[|]", ""))
                .forEach(s -> {
                    var key = Character.toString(s.charAt(0));
                    if (categoriesQuantity.containsKey(key)) {
                        var qtdAvailable = Integer.valueOf(s.split(" ")[1]);
                        Integer totalQtd = categoriesQuantity.get(key);
                        categoriesQuantity.put(key, totalQtd + qtdAvailable);
                    }
                });

        var result = new StringBuilder();
        categoriesQuantity
                .forEach((k, v) -> result.append(String.format("(%s : %d) - ", k, v)));
        return result.delete(result.length() - 3, result.length()).toString();
    }

}
