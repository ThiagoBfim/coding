package codewar.kyu.seven;

public class FunListIndexOf {

    static int indexOf(Node head, Object value) {
        var count = 0;
        while (head != null) {
            if (head.data == value) {
                return count;
            }
            head = head.next;
            count++;
        }
        return -1;
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
