package com.raydya;

import com.raydya.data.type.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class SwapNodesInPairsTest {
    @Test
    public void test1() {
        final ListNode n3 = new ListNode(4);
        final ListNode n2 = new ListNode(3, n3);
        final ListNode n1 = new ListNode(2, n2);
        final ListNode head = new ListNode(1, n1);

        final SwapNodesInPairs solution = new SwapNodesInPairs();
        final ListNode swapPairs = solution.swapPairs(head);

        Assert.assertEquals(2, swapPairs.val);
        Assert.assertEquals(1, swapPairs.next.val);
        Assert.assertEquals(4, swapPairs.next.next.val);
        Assert.assertEquals(3, swapPairs.next.next.next.val);
    }

    @Test
    public void test2() {
        final SwapNodesInPairs solution = new SwapNodesInPairs();
        final ListNode swapPairs = solution.swapPairs(null);

        Assert.assertNull(swapPairs);
    }

    @Test
    public void test3() {
        final ListNode head = new ListNode(1);

        final SwapNodesInPairs solution = new SwapNodesInPairs();
        final ListNode swapPairs = solution.swapPairs(head);

        Assert.assertEquals(1, swapPairs.val);
    }

    @Test
    public void test4() {
        final ListNode n1 = new ListNode(2);
        final ListNode head = new ListNode(1, n1);

        final SwapNodesInPairs solution = new SwapNodesInPairs();
        final ListNode swapPairs = solution.swapPairs(head);

        Assert.assertEquals(2, swapPairs.val);
        Assert.assertEquals(1, swapPairs.next.val);
    }

    @Test
    public void test5() {
        final ListNode n4 = new ListNode(5);
        final ListNode n3 = new ListNode(4, n4);
        final ListNode n2 = new ListNode(3, n3);
        final ListNode n1 = new ListNode(2, n2);
        final ListNode head = new ListNode(1, n1);

        final SwapNodesInPairs solution = new SwapNodesInPairs();
        final ListNode swapPairs = solution.swapPairs(head);

        Assert.assertEquals(2, swapPairs.val);
        Assert.assertEquals(1, swapPairs.next.val);
        Assert.assertEquals(4, swapPairs.next.next.val);
        Assert.assertEquals(3, swapPairs.next.next.next.val);
        Assert.assertEquals(5, swapPairs.next.next.next.next.val);
    }
}
