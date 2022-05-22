package codewar.kyu.seven;

import java.util.function.Predicate;

public class FunListMatch {

    static <T> boolean anyMatch(Node<T> head, Predicate<T> p) {
        while (head != null) {
            var anyMatch = p.test(head.data);
            if (anyMatch) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    static <T> boolean allMatch(Node<T> head, Predicate<T> p) {
        while (head != null) {
            var allMatch = p.test(head.data);
            if (!allMatch) {
                return false;
            }
            head = head.next;
        }
        return true;
    }


    static class Node<T> {
        public T data;
        public Node next;

        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        Node(T data) {
            this(data, null);
        }
    }
}
