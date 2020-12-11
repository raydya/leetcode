package com.raydya;

import com.raydya.data.type.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class RotateListTest {
    @Test
    public void test1() {
        final ListNode n4 = new ListNode(5);
        final ListNode n3 = new ListNode(4, n4);
        final ListNode n2 = new ListNode(3, n3);
        final ListNode n1 = new ListNode(2, n2);
        final ListNode head = new ListNode(1, n1);

        final RotateList solution = new RotateList();
        final ListNode node = solution.rotateRight(head, 2);

        Assert.assertEquals(node, n3);
        Assert.assertEquals(node.next, n4);
        Assert.assertEquals(node.next.next, head);
        Assert.assertEquals(node.next.next.next, n1);
        Assert.assertEquals(node.next.next.next.next, n2);
    }

    @Test
    public void test2() {
        final ListNode n2 = new ListNode(2);
        final ListNode n1 = new ListNode(1, n2);
        final ListNode head = new ListNode(0, n1);

        final RotateList solution = new RotateList();
        final ListNode node = solution.rotateRight(head, 4);

        Assert.assertEquals(node, n2);
        Assert.assertEquals(node.next, head);
        Assert.assertEquals(node.next.next, n1);
    }

    @Test
    public void test3() {
        final RotateList solution = new RotateList();
        final ListNode node = solution.rotateRight(null, 0);

        Assert.assertNull(node);
    }

    @Test
    public void test4() {
        final ListNode n2 = new ListNode(3);
        final ListNode n1 = new ListNode(2, n2);
        final ListNode head = new ListNode(1, n1);

        final RotateList solution = new RotateList();
        final ListNode node = solution.rotateRight(head, 2000000000);

        Assert.assertEquals(node, n1);
        Assert.assertEquals(node.next, n2);
        Assert.assertEquals(node.next.next, head);
    }
}
