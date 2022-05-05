package codewar.kyu.four;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortBinaryTree {

    public static List<Integer> treeByLevels(Node node) {
        Map<Integer, List<Integer>> values = new HashMap<>();
        inorderRec(node, values, 0);
        return values.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .flatMap(s -> s.getValue().stream())
                .collect(Collectors.toList());
    }

    public static void inorderRec(Node root, Map<Integer, List<Integer>> values, int level) {
        if (root != null) {
            if (values.containsKey(level)) {
                values.get(level).add(root.value);
            } else {
                List<Integer> elements = new ArrayList<>();
                elements.add(root.value);
                values.put(level, elements);
            }
            level += 1;
            inorderRec(root.left, values, level);
            inorderRec(root.right, values, level);
        }
    }

    public static class Node {
        public Node left;
        public Node right;
        public int value;

        public Node(Node l, Node r, int v) {
            left = l;
            right = r;
            value = v;
        }
    }
}
