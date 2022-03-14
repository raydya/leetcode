package com.raydya;

import com.raydya.data.type.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class ReverseLinkedListTest {

    @Test
    public void test1() {
        final ListNode n4 = new ListNode(5);
        final ListNode n3 = new ListNode(4, n4);
        final ListNode n2 = new ListNode(3, n3);
        final ListNode n1 = new ListNode(2, n2);
        final ListNode head = new ListNode(1, n1);

        final ReverseLinkedList solution = new ReverseLinkedList();
        final ListNode reverseList = solution.reverseList(head);

        Assert.assertEquals(5, reverseList.val);
        Assert.assertEquals(4, reverseList.next.val);
        Assert.assertEquals(3, reverseList.next.next.val);
        Assert.assertEquals(2, reverseList.next.next.next.val);
        Assert.assertEquals(1, reverseList.next.next.next.next.val);
        Assert.assertNull(reverseList.next.next.next.next.next);
    }
}
