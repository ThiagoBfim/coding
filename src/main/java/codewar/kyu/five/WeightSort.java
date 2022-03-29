package codewar.kyu.five;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WeightSort {

    public static String orderWeight(String weightsElements) {
        String[] weights = weightsElements.split(" ");

        List<Weight> elements = new ArrayList<>();
        Stream.of(weights)
                .map(String::trim)
                .filter(w -> !w.isBlank())
                .forEach(w -> {
                    int sum = w.chars().mapToObj(v -> String.valueOf((char) v)).mapToInt(Integer::valueOf).sum();
                    elements.add(new Weight(w, sum));
                });

        return elements
                .stream()
                .sorted()
                .map(a -> a.weight)
                .collect(Collectors.joining(" "));
    }

    private static class Weight implements Comparable<Weight> {
        private final String weight;
        private final Integer sum;

        private Weight(String weight, Integer sum) {
            this.weight = weight;
            this.sum = sum;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            var weight1 = (Weight) o;
            return Objects.equals(weight, weight1.weight) &&
                    Objects.equals(sum, weight1.sum);
        }

        @Override
        public int hashCode() {
            return Objects.hash(weight, sum);
        }

        @Override
        public int compareTo(Weight o) {
            int compare = sum.compareTo(o.sum);
            if (compare == 0) {
                return weight.compareTo(o.weight);
            }
            return compare;
        }
    }


}
