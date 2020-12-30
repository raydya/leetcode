package com.raydya;

import com.raydya.data.type.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedListIITest {
    @Test
    public void test1() {
        final ListNode n6 = new ListNode(5);
        final ListNode n5 = new ListNode(4, n6);
        final ListNode n4 = new ListNode(4, n5);
        final ListNode n3 = new ListNode(3, n4);
        final ListNode n2 = new ListNode(3, n3);
        final ListNode n1 = new ListNode(2, n2);
        final ListNode head = new ListNode(1, n1);

        final RemoveDuplicatesFromSortedListII solution = new RemoveDuplicatesFromSortedListII();
        final ListNode node = solution.deleteDuplicates(head);

        Assert.assertEquals(1, node.val);
        Assert.assertEquals(2, node.next.val);
        Assert.assertEquals(5, node.next.next.val);
    }

    @Test
    public void test2() {
        final ListNode n4 = new ListNode(3);
        final ListNode n3 = new ListNode(2, n4);
        final ListNode n2 = new ListNode(1, n3);
        final ListNode n1 = new ListNode(1, n2);
        final ListNode head = new ListNode(1, n1);

        final RemoveDuplicatesFromSortedListII solution = new RemoveDuplicatesFromSortedListII();
        final ListNode node = solution.deleteDuplicates(head);

        Assert.assertEquals(2, node.val);
        Assert.assertEquals(3, node.next.val);
    }
}
