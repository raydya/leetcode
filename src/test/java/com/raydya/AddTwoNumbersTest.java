package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersTest {
    @Test
    public void test() {
        final ListNode a3 = new ListNode(3);
        final ListNode a2 = new ListNode(4, a3);
        final ListNode a1 = new ListNode(2, a2);

        final ListNode b3 = new ListNode(4);
        final ListNode b2 = new ListNode(6, b3);
        final ListNode b1 = new ListNode(5, b2);

        final AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        final ListNode node = addTwoNumbers.addTwoNumbers(a1, b1);

        Assert.assertEquals(7, node.val);
        Assert.assertEquals(0, node.next.val);
        Assert.assertEquals(8, node.next.next.val);
    }

    @Test
    public void test2() {
        final ListNode a1 = new ListNode(5);
        final ListNode b1 = new ListNode(5);

        final AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        final ListNode node = addTwoNumbers.addTwoNumbers(a1, b1);

        Assert.assertEquals(0, node.val);
        Assert.assertEquals(1, node.next.val);
    }

    @Test
    public void test3() {
        final ListNode a2 = new ListNode(8);
        final ListNode a1 = new ListNode(1, a2);

        final ListNode b1 = new ListNode(0);

        final AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        final ListNode node = addTwoNumbers.addTwoNumbers(a1, b1);

        Assert.assertEquals(1, node.val);
        Assert.assertEquals(8, node.next.val);
    }

    @Test
    public void test4() {
        final ListNode a1 = new ListNode(0);

        final ListNode b2 = new ListNode(3);
        final ListNode b1 = new ListNode(7, b2);

        final AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        final ListNode node = addTwoNumbers.addTwoNumbers(a1, b1);

        Assert.assertEquals(7, node.val);
        Assert.assertEquals(3, node.next.val);
    }
}
