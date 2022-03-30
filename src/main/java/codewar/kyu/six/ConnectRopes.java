package codewar.kyu.six;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class ConnectRopes {

    public static int addAll(final int[] numbers) {
        PriorityQueue<Integer> pq = Arrays.stream(numbers)
                .boxed().collect(Collectors.toCollection(PriorityQueue::new));

        int cost = 0;
        while (pq.size() > 1) {
            int sum = pq.poll() + pq.poll();
            pq.add(sum);
            cost += sum;
        }

        return cost;
    }

}
