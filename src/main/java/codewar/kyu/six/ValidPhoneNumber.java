package codewar.kyu.six;

import java.util.regex.Pattern;

/**
 * Write a function that accepts a string, and returns true if it is in the form of a phone number.
 * Assume that any integer from 0-9 in any of the spots will produce a valid phone number.
 *
 * Only worry about the following format:
 * (123) 456-7890 (don't forget the space after the close parentheses)
 */
public class ValidPhoneNumber {

    public static boolean validPhoneNumber(String phoneNumber) {
        var pattern = Pattern.compile("^\\(\\d{3}\\) \\d{3}\\-\\d{4}$");
        var matcher = pattern.matcher(phoneNumber);
        return matcher.find();
    }

    public static boolean betterSolution(String phoneNumber) {
        return phoneNumber.matches("\\(\\d{3}\\) \\d{3}\\-\\d{4}");
    }
}
