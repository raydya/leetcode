package com.raydya;

import com.raydya.data.type.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedListTest {

    @Test
    public void test1() {
        final ListNode a3 = new ListNode(2);
        final ListNode a2 = new ListNode(1, a3);
        final ListNode a1 = new ListNode(1, a2);

        final RemoveDuplicatesFromSortedList solution = new RemoveDuplicatesFromSortedList();
        final ListNode head = solution.deleteDuplicates(a1);

        Assert.assertEquals(1, head.val);
        Assert.assertEquals(2, head.next.val);
    }

    @Test
    public void test2() {
        final ListNode a5 = new ListNode(3);
        final ListNode a4 = new ListNode(3, a5);
        final ListNode a3 = new ListNode(2, a4);
        final ListNode a2 = new ListNode(1, a3);
        final ListNode a1 = new ListNode(1, a2);

        final RemoveDuplicatesFromSortedList solution = new RemoveDuplicatesFromSortedList();
        final ListNode head = solution.deleteDuplicates(a1);

        Assert.assertEquals(1, head.val);
        Assert.assertEquals(2, head.next.val);
        Assert.assertEquals(3, head.next.next.val);
    }

    @Test
    public void test3() {
        final ListNode a3 = new ListNode(1);
        final ListNode a2 = new ListNode(1, a3);
        final ListNode a1 = new ListNode(1, a2);

        final RemoveDuplicatesFromSortedList solution = new RemoveDuplicatesFromSortedList();
        final ListNode head = solution.deleteDuplicates(a1);

        Assert.assertEquals(1, head.val);
    }

    @Test
    public void test4() {
        final RemoveDuplicatesFromSortedList solution = new RemoveDuplicatesFromSortedList();
        final ListNode head = solution.deleteDuplicates(null);

        Assert.assertNull(head);
    }
}
