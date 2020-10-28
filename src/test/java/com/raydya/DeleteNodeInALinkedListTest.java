package com.raydya;

import com.raydya.data.type.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class DeleteNodeInALinkedListTest {
    @Test
    public void test1() {
        final ListNode tail = new ListNode(9);
        final ListNode n2 = new ListNode(1, tail);
        final ListNode n1 = new ListNode(5, n2);
        final ListNode head = new ListNode(4, n1);

        final DeleteNodeInALinkedList solution = new DeleteNodeInALinkedList();
        solution.deleteNode(n1);

        Assert.assertEquals(4, head.val);
        Assert.assertEquals(1, head.next.val);
        Assert.assertEquals(9, head.next.next.val);
        Assert.assertNull(head.next.next.next);
    }

    @Test
    public void test2() {
        final ListNode tail = new ListNode(9);
        final ListNode n2 = new ListNode(1, tail);
        final ListNode n1 = new ListNode(5, n2);
        final ListNode head = new ListNode(4, n1);

        final DeleteNodeInALinkedList solution = new DeleteNodeInALinkedList();
        solution.deleteNode(n2);

        Assert.assertEquals(4, head.val);
        Assert.assertEquals(5, head.next.val);
        Assert.assertEquals(9, head.next.next.val);
        Assert.assertNull(head.next.next.next);
    }

    @Test
    public void test3() {
        final ListNode tail = new ListNode(4);
        final ListNode n2 = new ListNode(3, tail);
        final ListNode n1 = new ListNode(2, n2);
        final ListNode head = new ListNode(1, n1);

        final DeleteNodeInALinkedList solution = new DeleteNodeInALinkedList();
        solution.deleteNode(n2);

        Assert.assertEquals(1, head.val);
        Assert.assertEquals(2, head.next.val);
        Assert.assertEquals(4, head.next.next.val);
        Assert.assertNull(head.next.next.next);
    }

    @Test
    public void test4() {
        final ListNode tail = new ListNode(1);
        final ListNode head = new ListNode(0, tail);

        final DeleteNodeInALinkedList solution = new DeleteNodeInALinkedList();
        solution.deleteNode(head);

        Assert.assertEquals(1, head.val);
        Assert.assertNull(head.next);
    }

    @Test
    public void test5() {
        final ListNode tail = new ListNode(-99);
        final ListNode n1 = new ListNode(5, tail);
        final ListNode head = new ListNode(-3, n1);

        final DeleteNodeInALinkedList solution = new DeleteNodeInALinkedList();
        solution.deleteNode(head);

        Assert.assertEquals(5, head.val);
        Assert.assertEquals(-99, head.next.val);
        Assert.assertNull(head.next.next);
    }
}
