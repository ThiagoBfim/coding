package codewar.kyu.six;

import java.util.Stack;

public class ValidBraces {

    public boolean isValid(String braces) {
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < braces.length(); i++) {
            char c = braces.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                characters.push(c);
            } else {
                if (characters.isEmpty()) {
                    return false;
                }
                Character pop = characters.pop();
                if (c == ')' && pop != '('
                        || c == ']' && pop != '['
                        || c == '}' && pop != '{') {
                    return false;
                }
            }
        }
        return characters.isEmpty();
    }
}
