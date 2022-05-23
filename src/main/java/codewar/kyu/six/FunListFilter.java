package codewar.kyu.six;

import java.util.Objects;
import java.util.function.Predicate;

public class FunListFilter {

    static <T> Node<T> filter(Node<T> head, Predicate<T> p) {
        if (head == null) {
            return null;
        }
        if (p.test(head.data)) {
            return new Node<>(head.data, filter(head.next, p));
        } else {
            return filter(head.next, p);
        }
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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?> node = (Node<?>) o;
            return Objects.equals(data, node.data) &&
                    Objects.equals(next, node.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(data, next);
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next.toString() +
                    '}';
        }
    }
}
