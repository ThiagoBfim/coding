package codewar.kyu.seven;

public class FunListLastIndexOf {

    static int lastIndexOf(Node head, Object value) {
        var count = 0;
        var index = -1;
        while (head != null) {
            if (head.data == value) {
                index = count;
            }
            head = head.next;
            count++;
        }
        return index;
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
