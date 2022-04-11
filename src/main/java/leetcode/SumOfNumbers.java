package leetcode;

public class SumOfNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode nextL1 = l1;
        ListNode nextL2 = l2;
        ListNode curr = result;
        int carry = 0;

        do {
            int sum = carry;
            if (nextL1 == null) {
                sum += nextL2.val;
            } else if (nextL2 == null) {
                sum += nextL1.val;
            } else {
                sum += nextL1.val + nextL2.val;
            }
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (nextL1 != null) nextL1 = nextL1.next;
            if (nextL2 != null) nextL2 = nextL2.next;
        } while (nextL2 != null || nextL1 != null);
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return result.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return val + "," + next;
        }
    }
}
