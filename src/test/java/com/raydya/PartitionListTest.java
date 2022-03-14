package com.raydya;

import com.raydya.data.type.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class PartitionListTest {

    @Test
    public void test1() {
        final ListNode n5 = new ListNode(2);
        final ListNode n4 = new ListNode(5, n5);
        final ListNode n3 = new ListNode(2, n4);
        final ListNode n2 = new ListNode(3, n3);
        final ListNode n1 = new ListNode(4, n2);
        final ListNode head = new ListNode(1, n1);

        final PartitionList solution = new PartitionList();
        final ListNode partition = solution.partition(head, 3);

        Assert.assertEquals(1, partition.val);
        Assert.assertEquals(2, partition.next.val);
        Assert.assertEquals(2, partition.next.next.val);
        Assert.assertEquals(4, partition.next.next.next.val);
        Assert.assertEquals(3, partition.next.next.next.next.val);
        Assert.assertEquals(5, partition.next.next.next.next.next.val);
    }
}
