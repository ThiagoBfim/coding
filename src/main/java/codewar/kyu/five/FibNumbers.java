package codewar.kyu.five;

import java.util.ArrayList;
import java.util.List;

/**
 * Your function productFib takes an integer (prod) and returns an array:
 *
 * [F(n), F(n+1), true] or {F(n), F(n+1), 1} or (F(n), F(n+1), True)
 * depending on the language if F(n) * F(n+1) = prod.
 *
 * If you don't find two consecutive F(n) verifying F(n) * F(n+1) = prod you will return
 *
 * [F(n), F(n+1), false] or {F(n), F(n+1), 0} or (F(n), F(n+1), False)
 * F(n) being the smallest one such as F(n) * F(n+1) > prod.
 */
public class FibNumbers {

    public static long[] productFib(long prod) {
        List<Long> elements = new ArrayList<>();
        long value = 0;
        List<Long> fibonacci = fibonacci(value, elements, prod);
        Long last = fibonacci.get(fibonacci.size() - 1);
        Long penultimate = fibonacci.get(fibonacci.size() - 2);
        int equals = last * penultimate == prod ? 1 : 0;
        return new long[]{penultimate, last, equals};
    }

    private static List<Long> fibonacci(long value, List<Long> elements, long prod) {
        elements.add(value);
        if(elements.size() >= 2){
            if(elements.get(elements.size() -1) * elements.get(elements.size() -2) >= prod){
                return elements;
            }
        } else {
              elements.add(1L);
        }

        fibonacci(elements.get(elements.size() - 1) + elements.get(elements.size() - 2), elements, prod);

        return elements;
    }
}
