package codewar.kyu.five;

import codewar.kyu.five.FunListTreeFlatten.ListNode;
import codewar.kyu.five.FunListTreeFlatten.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FunListTreeFlattenTest {

    private static void testFlatten(ListNode input_list_head, TreeNode expected_tree_root){
        Assertions.assertThat(FunListTreeFlatten.flatten(input_list_head)).isEqualTo(expected_tree_root);
    }

    @Test
    public void nullList() {
        testFlatten(null, null);
    }

    @Test
    public void exampleList() {
        TreeNode t1 = new TreeNode(1, null, new TreeNode(2));
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(3, new TreeNode(4), new TreeNode(2));
        TreeNode t4 = new TreeNode(6, null, new TreeNode(5));

        ListNode head = new ListNode(t1, new ListNode(t2, new ListNode(t3, new ListNode(t4))));
        TreeNode expected = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), null));
        testFlatten(head, expected);
    }
    @Test
    public void exampleList2() {
        TreeNode t1 = new TreeNode(1, null, new TreeNode(2));
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(3, new TreeNode(4), new TreeNode(2));
        TreeNode t4 = new TreeNode(6,  new TreeNode(5), new TreeNode(7));
        TreeNode t5 = new TreeNode(7, new TreeNode(8), new TreeNode(9));
        TreeNode t6 = new TreeNode(8, new TreeNode(10), new TreeNode(11));

        /*
        *          1
                /     \
               2       3
              / \     / \
             4   5   6   7
            / \ / \
           8  9 10 11
        * */
        ListNode head = new ListNode(t1, new ListNode(t2, new ListNode(t3, new ListNode(t4, new ListNode(t5, new ListNode(t6))))));
        TreeNode expected = new TreeNode(1, new TreeNode(2, new TreeNode(4, new TreeNode(8), new TreeNode(9)),
                new TreeNode(5, new TreeNode(10), new TreeNode(11))),
                new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        testFlatten(head, expected);
    }
}
