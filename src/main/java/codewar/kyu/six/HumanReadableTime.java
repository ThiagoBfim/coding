package codewar.kyu.six;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HumanReadableTime {

    public static String makeReadableClever(int seconds) {
        return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
    }

    public static String makeReadable(int seconds) {
        final var dateTimeFormatterOutput = DateTimeFormatter.ofPattern("HH:mm:ss");
        final var dateTimeFormatterInput = DateTimeFormatter.ofPattern("H:m:s");
        int minutes = seconds / 60;
        int hours = seconds / 60 / 60;
        return LocalTime.parse(String.format("00:%d:%d", minutes % 60, seconds % 60), dateTimeFormatterInput)
                .format(dateTimeFormatterOutput).replaceFirst("00", hours < 10 ? "0" + hours : String.valueOf(hours));
    }
}
