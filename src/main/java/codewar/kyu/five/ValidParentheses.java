package codewar.kyu.five;

import java.util.List;
import java.util.stream.Collectors;

public class ValidParentheses {

    public static boolean validParentheses(String parens) {
        if (parens.startsWith(")")) {
            return false;
        }

        List<String> parentheses = parens.chars()
                .mapToObj(v -> String.valueOf((char) v))
                .filter(v -> v.equals(")") || v.equals("("))
                .collect(Collectors.toList());

        var opened = 0;
        for (String parenthesis : parentheses) {
            if (parenthesis.equals("(")) {
                opened += 1;
            } else {
                if (opened == 0) {
                    return false;
                }
                opened -= 1;
            }
        }
        return opened == 0;
    }

}
