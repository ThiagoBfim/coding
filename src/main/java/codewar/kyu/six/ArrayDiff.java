package codewar.kyu.six;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDiff {

    public static int[] arrayDiff(int[] list1, int[] list2) {
        List<Integer> collect = Arrays.stream(list1)
                .filter(a -> Arrays.stream(list2).parallel().anyMatch(b -> a == b))
                .boxed()
                .collect(Collectors.toList());

        List<Integer> singleElements = Arrays.stream(list1).boxed().collect(Collectors.toList());
        singleElements.removeAll(collect);
        return singleElements.stream().mapToInt(i -> i).toArray();
    }

    public static int[] arrayDiffClever(int[] a, int[] b) {
        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
        listA.removeAll(listB);
        return listA.stream().mapToInt(e -> e).toArray();
    }

}
