package codewar.kyu.five;


public class PigLatin {

    public static String pigIt(String str) {
        String[] words = str.split(" ");
        var completePhrase = new StringBuilder();
        for (String word : words) {
            if (word.matches("[A-Za-z0-9]+")) {
                String newWord = word.substring(1) + word.charAt(0) + "ay ";
                completePhrase.append(newWord);
            } else {
                completePhrase.append(word).append(" ");
            }
        }
        return completePhrase.substring(0, completePhrase.length() - 1);
    }

    public static String pigItClever(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }

}
