package codewar.kyu.six;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class SimpleTimeDifference {

    public static String solve(String[] arr) {
        var parser = DateTimeFormatter.ofPattern("HH:mm");
        Integer biggerDifference = null;
        LocalDateTime lastTime = null;
        List<String> times = Arrays.stream(arr).sorted().collect(Collectors.toList());

        for (int i = 0; i <= times.size(); i++) {
            LocalDateTime currentTime;
            if (times.size() == i) {
                currentTime = LocalDate.ofYearDay(2020, 2).atTime(LocalTime.parse(times.get(0)));
            } else {
                currentTime = LocalDate.ofYearDay(2020, 1).atTime(LocalTime.parse(times.get(i), parser));
            }
            if (lastTime != null) {
                long differenceMinutes;
                if(lastTime.toLocalTime().equals(currentTime.toLocalTime())){
                    differenceMinutes = 0;
                } else {
                    differenceMinutes = Math.abs(ChronoUnit.MINUTES.between(lastTime, currentTime));
                }
                if (biggerDifference == null || biggerDifference < differenceMinutes) {
                    biggerDifference = (int) differenceMinutes;
                }
            }
            lastTime = currentTime;
        }
        return String.valueOf(LocalTime.of(biggerDifference / 60, (biggerDifference % 60)).minusMinutes(1L));
    }


}
