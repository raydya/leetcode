package com.raydya;

import com.raydya.data.type.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class ReverseLinkedListIITest {

    @Test
    public void test1() {
        final ListNode n5 = new ListNode(5);
        final ListNode n4 = new ListNode(4, n5);
        final ListNode n3 = new ListNode(3, n4);
        final ListNode n2 = new ListNode(2, n3);
        final ListNode head = new ListNode(1, n2);

        final ReverseLinkedListII solution = new ReverseLinkedListII();
        final ListNode node = solution.reverseBetween(head, 2, 4);

        Assert.assertEquals(1, node.val);
        Assert.assertEquals(4, node.next.val);
        Assert.assertEquals(3, node.next.next.val);
        Assert.assertEquals(2, node.next.next.next.val);
        Assert.assertEquals(5, node.next.next.next.next.val);
    }
}
