package codewar.kyu.four;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TextAlignJustify {

    public static final String BLANK_SPACE = " ";
    public static final String BREAK_LINE = "\n";

    public static String justify(String text, int width) {
        String[] words = text.split(BLANK_SPACE);
        var textJustify = new StringBuilder();

        Stream.of(words)
                .forEach(w -> breakLines(width, textJustify, w));

        return justifyText(textJustify, width).trim();
    }

    private static void breakLines(int width, StringBuilder textJustify, String w) {
        String[] lines = getLines(textJustify.toString());
        if (lines[lines.length - 1].length() + w.length() <= width) {
            textJustify.append(w).append(BLANK_SPACE);
        } else {
            textJustify.append(BREAK_LINE).append(w).append(BLANK_SPACE);
        }
    }

    private static String justifyText(StringBuilder textJustify, int width) {
        String[] lines = getLines(textJustify.toString());
        return Stream.of(lines)
                .limit(lines.length - 1L)
                .map(line -> addingSpaces(line, width))
                .collect(Collectors.joining(BREAK_LINE)) + BREAK_LINE + lines[lines.length - 1];
    }

    private static String[] getLines(String text) {
        return text.split(BREAK_LINE);
    }

    private static String addingSpaces(String line, int width) {
        var numberSpaces = new AtomicInteger(2);
        line = line.trim();
        while (line.length() < width) {
            String[] words = line.split("\\s+", width - (line.length() - 1));
            if (words.length == 1) {
                return line;
            }
            line = Stream.of(words)
                    .limit(words.length - 1L)
                    .map(w -> w + sumSpaces(numberSpaces))
                    .collect(Collectors.joining(""))
                    + words[words.length - 1];
            numberSpaces.incrementAndGet();
        }
        return line;
    }

    private static String sumSpaces(AtomicInteger numberSpaces) {
        return new String(new char[numberSpaces.get()]).replace("\0", BLANK_SPACE);
    }


}
