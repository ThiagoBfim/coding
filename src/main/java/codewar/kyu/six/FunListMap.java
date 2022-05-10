package codewar.kyu.six;

import java.util.function.Function;

public class FunListMap {

    static <T, R> Node<R> map(Node<T> head, Function<T, R> function) {
        if(head == null){
            return null;
        }
        Node<R> newHead = new Node<>(function.apply(head.data));
        Node<R> root = new Node<>(null, newHead);
        while (head.next != null) {
            newHead.next = new Node<>(function.apply(head.next.data));
            newHead = newHead.next;
            head = head.next;
        }
        return root.next;
    }


    static class Node<T> {
        public T data;
        public Node<T> next;

        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        Node(T data) {
            this(data, null);
        }
    }
}
