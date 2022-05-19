package codewar.kyu.seven;

public class FunListLength {

    static int length(Node head) {
        if (head == null) {
            return 0;
        }
        var count = 1;
        while (head.next != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    static int lengthClever(Node head) {
        return head == null ? 0 : 1 + length(head.next);
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
