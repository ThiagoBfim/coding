package codewar.kyu.six;

import java.util.Objects;
import java.util.function.BiFunction;

public class FunListReduce {

    static <T> T reduce(Node<T> head, BiFunction<T, T, T> f, T init) {
        if (head == null) {
            return init;
        }
        return reduce((Node<T>) head.next, f, f.apply(init, head.data));
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
