package com.raydya;

import com.raydya.data.type.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class DetectCycleTest {

    @Test
    public void test1() {
        final ListNode n3 = new ListNode(-4);
        final ListNode n2 = new ListNode(0, n3);
        final ListNode n1 = new ListNode(2, n2);
        n3.next = n1;
        final ListNode head = new ListNode(3, n1);

        final DetectCycle solution = new DetectCycle();
        final ListNode output = solution.detectCycle(head);

        Assert.assertEquals(n1, output);
    }

    @Test
    public void test2() {
        final ListNode n1 = new ListNode(2);
        final ListNode head = new ListNode(1, n1);
        n1.next = head;

        final DetectCycle solution = new DetectCycle();
        final ListNode output = solution.detectCycle(head);

        Assert.assertEquals(head, output);
    }

    @Test
    public void test3() {
        final ListNode head = new ListNode(1);

        final DetectCycle solution = new DetectCycle();
        final ListNode output = solution.detectCycle(head);

        Assert.assertNull(output);
    }
}
