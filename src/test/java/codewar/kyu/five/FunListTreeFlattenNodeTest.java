package codewar.kyu.five;

import codewar.kyu.five.FunListTreeFlattenNode.ListNode;
import codewar.kyu.five.FunListTreeFlattenNode.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FunListTreeFlattenNodeTest {

    private static void testFlatten(TreeNode input_tree_root, ListNode expected_list_head){
        Assertions.assertThat(FunListTreeFlattenNode.flatten(input_tree_root)).isEqualTo(expected_list_head);
    }

    @Test
    public void nullTree() {
        testFlatten(null, null);
    }

    @Test
    public void exampleTree() {
        ListNode l1 = new ListNode(17, new ListNode(1));
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(16);
        ListNode l6 = new ListNode(7, new ListNode(3));
        TreeNode root = new TreeNode(l1, new TreeNode(l2, new TreeNode(l4), null), new TreeNode(l3, new TreeNode(l5), new TreeNode(l6)));

        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(7, new ListNode(16, new ListNode(17))))));
        testFlatten(root, expected);
    }
}
