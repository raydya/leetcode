package com.raydya;

import com.raydya.data.type.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class MergeTwoSortedListTest {

    @Test
    public void test1() {
        final ListNode a3 = new ListNode(4);
        final ListNode a2 = new ListNode(2, a3);
        final ListNode a1 = new ListNode(1, a2);

        final ListNode b3 = new ListNode(4);
        final ListNode b2 = new ListNode(3, b3);
        final ListNode b1 = new ListNode(1, b2);

        final MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
        final ListNode listNode = mergeTwoSortedList.mergeTwoLists(a1, b1);

        Assert.assertEquals(1, listNode.val);
        Assert.assertEquals(1, listNode.next.val);
        Assert.assertEquals(2, listNode.next.next.val);
        Assert.assertEquals(3, listNode.next.next.next.val);
        Assert.assertEquals(4, listNode.next.next.next.next.val);
        Assert.assertEquals(4, listNode.next.next.next.next.next.val);
    }

    @Test
    public void test2() {
        final ListNode b1 = new ListNode(0, null);

        final MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
        final ListNode listNode = mergeTwoSortedList.mergeTwoLists(null, b1);

        Assert.assertEquals(0, listNode.val);
    }

    @Test
    public void test3() {
        final ListNode a1 = new ListNode(2, null);
        final ListNode b1 = new ListNode(1, null);

        final MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
        final ListNode listNode = mergeTwoSortedList.mergeTwoLists(a1, b1);

        Assert.assertEquals(1, listNode.val);
        Assert.assertEquals(2, listNode.next.val);
    }

    @Test
    public void test4() {
        final ListNode a1 = new ListNode(5);

        final ListNode b3 = new ListNode(4);
        final ListNode b2 = new ListNode(2, b3);
        final ListNode b1 = new ListNode(1, b2);

        final MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
        final ListNode listNode = mergeTwoSortedList.mergeTwoLists(a1, b1);

        Assert.assertEquals(1, listNode.val);
        Assert.assertEquals(2, listNode.next.val);
        Assert.assertEquals(4, listNode.next.next.val);
        Assert.assertEquals(5, listNode.next.next.next.val);
    }

    @Test
    public void test5() {
        final ListNode a2 = new ListNode(3);
        final ListNode a1 = new ListNode(-9, a2);

        final ListNode b2 = new ListNode(7);
        final ListNode b1 = new ListNode(5, b2);

        final MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
        final ListNode listNode = mergeTwoSortedList.mergeTwoLists(a1, b1);

        Assert.assertEquals(-9, listNode.val);
        Assert.assertEquals(3, listNode.next.val);
        Assert.assertEquals(5, listNode.next.next.val);
        Assert.assertEquals(7, listNode.next.next.next.val);
    }
}
