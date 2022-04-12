package codewar.kyu.six;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RomanEncoder {


    public String solution(int value) {
        var buildNumber = new StringBuilder();
        List<Integer> numbers = String.valueOf(value).chars().mapToObj(Character::getNumericValue).collect(Collectors.toList());
        int sizeOfNumber = numbers.size() - 1;
        for (Integer number : numbers) {
            addNumber(buildNumber, sizeOfNumber, number);
            sizeOfNumber--;
        }
        return buildNumber.toString();
    }

    private void addNumber(StringBuilder buildNumber, int sizeOfNumber, Integer number) {
        var unit = Integer.parseInt("1" + "0".repeat(sizeOfNumber));
        var numberWithDecimalPlaces = number * unit;
        var romanNumber = Roman.findByValue(numberWithDecimalPlaces);
        if (romanNumber != null) {
            buildNumber.append(romanNumber.name());
        } else if (number <= 3) {
            buildNumber.append(Roman.findByDecimalPlace(sizeOfNumber).name().repeat(number));
        } else if (number == 9 || number == 4) {
            buildNumber.append(Roman.findByDecimalPlace(sizeOfNumber));
            buildNumber.append(Roman.findNearestByValue(numberWithDecimalPlaces));
        } else {
            var nextValue = Roman.findNearestByValue(numberWithDecimalPlaces);//6,7,8
            if (nextValue != null) {
                buildNumber.append(nextValue);
                addNumber(buildNumber, sizeOfNumber, (numberWithDecimalPlaces - nextValue.value) / unit);
            }
        }
    }

    enum Roman {
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000);

        private final int value;

        Roman(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static Roman findByDecimalPlace(int decimalPlace) {
            if (decimalPlace == 0) {
                return I;
            }
            if (decimalPlace == 1) {
                return X;
            }
            if (decimalPlace == 2) {
                return C;
            }
            return M;
        }

        public static Roman findNearestByValue(int value) {
            return Arrays.stream(values()).filter(r -> (double) r.value / value >= 0.6).findFirst().orElse(null);
        }

        public static Roman findByValue(int value) {
            return Arrays.stream(values()).filter(r -> r.value == value).findFirst().orElse(null);
        }
    }

}
