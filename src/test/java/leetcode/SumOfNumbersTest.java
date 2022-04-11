package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SumOfNumbersTest {

    @Test
    void simpleTest() {
        SumOfNumbers.ListNode node1b = new SumOfNumbers.ListNode(4);
        SumOfNumbers.ListNode node1a = new SumOfNumbers.ListNode(2, node1b);

        SumOfNumbers.ListNode node2b = new SumOfNumbers.ListNode(3);
        SumOfNumbers.ListNode node2a = new SumOfNumbers.ListNode(3, node2b);
        SumOfNumbers.ListNode listNode = SumOfNumbers.addTwoNumbers(node1a, node2a);//l1[2,4], l2 = [3,3]
        System.out.println(listNode.toString()); //[5,7]
        Assertions.assertThat(listNode.toString()).isEqualTo("5,7,null");
    }

    @Test
    void mediumTest() {
        SumOfNumbers.ListNode node1c = new SumOfNumbers.ListNode(3);
        SumOfNumbers.ListNode node1b = new SumOfNumbers.ListNode(4, node1c);
        SumOfNumbers.ListNode node1a = new SumOfNumbers.ListNode(2, node1b);

        SumOfNumbers.ListNode node2c = new SumOfNumbers.ListNode(4);
        SumOfNumbers.ListNode node2b = new SumOfNumbers.ListNode(6, node2c);
        SumOfNumbers.ListNode node2a = new SumOfNumbers.ListNode(5, node2b);
        SumOfNumbers.ListNode listNode = SumOfNumbers.addTwoNumbers(node1a, node2a);//l1[2,4,3], l2 = [5,6,4]
        System.out.println(listNode.toString()); //[7,0,8]
        Assertions.assertThat(listNode.toString()).isEqualTo("7,0,8,null");

    }

    @Test
    void complexTest() {
        SumOfNumbers.ListNode node1g = new SumOfNumbers.ListNode(9);
        SumOfNumbers.ListNode node1f = new SumOfNumbers.ListNode(9, node1g);
        SumOfNumbers.ListNode node1e = new SumOfNumbers.ListNode(9, node1f);
        SumOfNumbers.ListNode node1d = new SumOfNumbers.ListNode(9, node1e);
        SumOfNumbers.ListNode node1c = new SumOfNumbers.ListNode(9, node1d);
        SumOfNumbers.ListNode node1b = new SumOfNumbers.ListNode(9, node1c);
        SumOfNumbers.ListNode node1a = new SumOfNumbers.ListNode(9, node1b);

        SumOfNumbers.ListNode node2d = new SumOfNumbers.ListNode(9);
        SumOfNumbers.ListNode node2c = new SumOfNumbers.ListNode(9, node2d);
        SumOfNumbers.ListNode node2b = new SumOfNumbers.ListNode(9, node2c);
        SumOfNumbers.ListNode node2a = new SumOfNumbers.ListNode(9, node2b);

        SumOfNumbers.ListNode listNode = SumOfNumbers.addTwoNumbers(node1a, node2a); //l1[9,9,9,9,9,9,9], l2 = [9,9,9,9]
        System.out.println(listNode.toString()); //[8,9,9,9,0,0,0,1]
        Assertions.assertThat(listNode.toString()).isEqualTo("8,9,9,9,0,0,0,1,null");

    }
}
