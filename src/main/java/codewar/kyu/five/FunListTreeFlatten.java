package codewar.kyu.five;

import java.util.*;

public class FunListTreeFlatten {

    static TreeNode flatten(ListNode head) {

        if (head == null) return null;
        Set<Integer> treeValues = new TreeSet<>();

        //breadth-first search
        Queue<TreeNode> nodesToVisit = new ArrayDeque<>(); //ArrayDeque is better than LinkedList if no removing in between is involved
        while (head != null) {
            nodesToVisit.offer(head.data);

            TreeNode current;
            while ((current = nodesToVisit.poll()) != null) {
                treeValues.add(current.value);
                if (current.left != null) nodesToVisit.offer(current.left);
                if (current.right != null) nodesToVisit.offer(current.right);
            }
            head = head.next;
        }

        return makeTree(new ArrayList<>(treeValues), 0);
    }


    private static TreeNode makeTree(List<Integer> treeValues, int i) {
        if (i >= treeValues.size())
            return null;
        return new TreeNode(treeValues.get(i), makeTree(treeValues, i * 2 + 1), makeTree(treeValues, i * 2 + 2));
    }

    static class ListNode {
        public TreeNode data;
        public ListNode next;

        ListNode(TreeNode data, ListNode next) {
            this.data = data;
            this.next = next;
        }

        ListNode(TreeNode data) {
            this(data, null);
        }
    }

    static class TreeNode {

        public TreeNode left;
        public TreeNode right;
        public int value;

        TreeNode(int value, TreeNode left, TreeNode right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        TreeNode(int value) {
            this(value, null, null);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TreeNode treeNode = (TreeNode) o;
            return value == treeNode.value &&
                    Objects.equals(left, treeNode.left) &&
                    Objects.equals(right, treeNode.right);
        }

        @Override
        public int hashCode() {
            return Objects.hash(left, right, value);
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "left=" + left +
                    ", right=" + right +
                    ", value=" + value +
                    '}';
        }
    }
}
