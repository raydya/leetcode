package com.raydya;

import com.raydya.data.type.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class RemoveNthNodeFromEndOfListTest {
    @Test
    public void test1() {
        final ListNode n4 = new ListNode(5);
        final ListNode n3 = new ListNode(4, n4);
        final ListNode n2 = new ListNode(3, n3);
        final ListNode n1 = new ListNode(2, n2);
        final ListNode head = new ListNode(1, n1);

        final RemoveNthNodeFromEndOfList solution = new RemoveNthNodeFromEndOfList();
        final ListNode nthFromEnd = solution.removeNthFromEnd(head, 2);

        Assert.assertEquals(n2, nthFromEnd.next.next);
        Assert.assertEquals(n4, nthFromEnd.next.next.next);
    }

    @Test
    public void test2() {
        final ListNode head = new ListNode(1);

        final RemoveNthNodeFromEndOfList solution = new RemoveNthNodeFromEndOfList();
        final ListNode nthFromEnd = solution.removeNthFromEnd(head, 1);

        Assert.assertNull(nthFromEnd);
    }

    @Test
    public void test3() {
        final ListNode n1 = new ListNode(2);
        final ListNode head = new ListNode(1, n1);

        final RemoveNthNodeFromEndOfList solution = new RemoveNthNodeFromEndOfList();
        final ListNode nthFromEnd = solution.removeNthFromEnd(head, 1);

        Assert.assertEquals(nthFromEnd, head);
        Assert.assertNull(nthFromEnd.next);
    }
}
