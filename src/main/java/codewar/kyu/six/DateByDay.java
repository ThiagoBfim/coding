package codewar.kyu.six;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public class DateByDay {

    static String getDayCleaver(int day, boolean isLeap) {
        return DateTimeFormatter.ofPattern("LLLL, d").withLocale(Locale.US).format(LocalDate.ofYearDay(isLeap ? 2020 : 2021, day));
    }

    public static String getDay(int day, boolean isLeap) {
        Map<Month, Integer> calendar = new LinkedHashMap<>();
        calendar.put(Month.JANUARY, lastDayOfYear(Month.JANUARY, isLeap));
        calendar.put(Month.FEBRUARY, lastDayOfYear(Month.FEBRUARY, isLeap));
        calendar.put(Month.MARCH, lastDayOfYear(Month.MARCH, isLeap));
        calendar.put(Month.APRIL, lastDayOfYear(Month.APRIL, isLeap));
        calendar.put(Month.MAY, lastDayOfYear(Month.MAY, isLeap));
        calendar.put(Month.JUNE, lastDayOfYear(Month.JUNE, isLeap));
        calendar.put(Month.JULY, lastDayOfYear(Month.JULY, isLeap));
        calendar.put(Month.AUGUST, lastDayOfYear(Month.AUGUST, isLeap));
        calendar.put(Month.SEPTEMBER, lastDayOfYear(Month.SEPTEMBER, isLeap));
        calendar.put(Month.OCTOBER, lastDayOfYear(Month.OCTOBER, isLeap));
        calendar.put(Month.NOVEMBER, lastDayOfYear(Month.NOVEMBER, isLeap));
        calendar.put(Month.DECEMBER, lastDayOfYear(Month.DECEMBER, isLeap));

        return calendar.entrySet()
                .stream()
                .filter(v -> day <= v.getValue())
                .findFirst()
                .map(v -> {
                    int dayMonth = day - v.getKey().firstDayOfYear(isLeap) + 1;
                    String monthCapitalize = capitalize(v.getKey().name());
                    return String.format("%s, %d", monthCapitalize, dayMonth);
                })
                .orElse(null);
    }

    public static String capitalize(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }

    public static int lastDayOfYear(Month month, boolean leapYear) {
        int leap = leapYear ? 1 : 0;
        switch (month) {
            case JANUARY:
                return 31;
            case FEBRUARY:
                return 59 + leap;
            case MARCH:
                return 90 + leap;
            case APRIL:
                return 120 + leap;
            case MAY:
                return 151 + leap;
            case JUNE:
                return 181 + leap;
            case JULY:
                return 212 + leap;
            case AUGUST:
                return 243 + leap;
            case SEPTEMBER:
                return 273 + leap;
            case OCTOBER:
                return 304 + leap;
            case NOVEMBER:
                return 334 + leap;
            case DECEMBER:
            default:
                return 365 + leap;
        }
    }

}
