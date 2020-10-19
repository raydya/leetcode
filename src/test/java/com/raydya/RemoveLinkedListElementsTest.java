package com.raydya;

import com.raydya.data.type.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class RemoveLinkedListElementsTest {
    @Test
    public void test1() {
        final ListNode n5 = new ListNode(6);
        final ListNode n4 = new ListNode(5, n5);
        final ListNode n3 = new ListNode(4, n4);
        final ListNode n2 = new ListNode(3, n3);
        final ListNode n1 = new ListNode(6, n2);
        final ListNode n0 = new ListNode(2, n1);
        final ListNode head = new ListNode(1, n0);

        final RemoveLinkedListElements solution = new RemoveLinkedListElements();
        final ListNode output = solution.removeElements(head, 6);

        Assert.assertEquals(1, output.val);
        Assert.assertEquals(2, output.next.val);
        Assert.assertEquals(3, output.next.next.val);
        Assert.assertEquals(4, output.next.next.next.val);
        Assert.assertEquals(5, output.next.next.next.next.val);
        Assert.assertNull(output.next.next.next.next.next);
    }

    @Test
    public void test2() {
        final ListNode head = new ListNode(1);

        final RemoveLinkedListElements solution = new RemoveLinkedListElements();
        final ListNode output = solution.removeElements(head, 1);

        Assert.assertNull(output);
    }

    @Test
    public void test3() {
        final RemoveLinkedListElements solution = new RemoveLinkedListElements();
        final ListNode output = solution.removeElements(null, 1);

        Assert.assertNull(output);
    }

    @Test
    public void test4() {
        final ListNode n0 = new ListNode(1);
        final ListNode head = new ListNode(1, n0);

        final RemoveLinkedListElements solution = new RemoveLinkedListElements();
        final ListNode output = solution.removeElements(head, 1);

        Assert.assertNull(output);
    }

    @Test
    public void test5() {
        final ListNode n2 = new ListNode(1);
        final ListNode n1 = new ListNode(2, n2);
        final ListNode n0 = new ListNode(2, n1);
        final ListNode head = new ListNode(1, n0);

        final RemoveLinkedListElements solution = new RemoveLinkedListElements();
        final ListNode output = solution.removeElements(head, 2);

        Assert.assertEquals(1, output.val);
        Assert.assertEquals(1, output.next.val);
        Assert.assertNull(output.next.next);
    }
}
