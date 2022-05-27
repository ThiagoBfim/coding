package codewar.kyu.five;

import java.util.*;
import java.util.stream.Collectors;

public class FunListTreeFlattenNode {

    static ListNode flatten(TreeNode head) {
        if (head == null) return null;
        List<Integer> treeValues = retrieveAllElements(head);

        var treeChild = new ListNode(treeValues.get(0));
        var treeRoot = new ListNode(0, treeChild);

        List<Integer> elementsOrdered = treeValues.stream().sorted(Integer::compareTo).skip(1)
                .collect(Collectors.toList());

        for (Integer treeValue : elementsOrdered) {
            treeChild.next = new ListNode(treeValue);
            treeChild = treeChild.next;
        }

        return treeRoot.next;
    }

    private static List<Integer> retrieveAllElements(TreeNode head) {
        Set<Integer> treeValues = new TreeSet<>();

        Queue<TreeNode> nodesToVisit = new ArrayDeque<>();
        nodesToVisit.offer(head);

        TreeNode current;
        while ((current = nodesToVisit.poll()) != null) {
            while (current.value != null) {
                treeValues.add(current.value.data);
                current.value = current.value.next;
            }
            if (current.left != null) nodesToVisit.offer(current.left);
            if (current.right != null) nodesToVisit.offer(current.right);
        }
        return new ArrayList<>(treeValues);
    }

    static class ListNode {
        public int data;
        public ListNode next;

        ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }

        ListNode(int data) {
            this(data, null);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ListNode listNode = (ListNode) o;
            return data == listNode.data &&
                    Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(data, next);
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    static class TreeNode {
        public TreeNode left;
        public TreeNode right;
        public ListNode value;

        TreeNode(ListNode value, TreeNode left, TreeNode right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        TreeNode(ListNode value) {
            this(value, null, null);
        }
    }
}
