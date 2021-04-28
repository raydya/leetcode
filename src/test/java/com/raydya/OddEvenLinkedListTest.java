package com.raydya;

import com.raydya.data.type.ListNode;
import com.raydya.utils.ListNodeUtil;
import org.junit.Assert;
import org.junit.Test;

public class OddEvenLinkedListTest {
    @Test
    public void test1() {
        final ListNode head = ListNodeUtil.build(new int[]{1, 2, 3, 4, 5});

        final OddEvenLinkedList solution = new OddEvenLinkedList();
        final ListNode output = solution.oddEvenList(head);

        Assert.assertEquals(1, output.val);
        Assert.assertEquals(3, output.next.val);
        Assert.assertEquals(5, output.next.next.val);
        Assert.assertEquals(2, output.next.next.next.val);
        Assert.assertEquals(4, output.next.next.next.next.val);
    }

    @Test
    public void test2() {
        final ListNode head = ListNodeUtil.build(new int[]{2, 1, 3, 5, 6, 4, 7});

        final OddEvenLinkedList solution = new OddEvenLinkedList();
        final ListNode output = solution.oddEvenList(head);

        Assert.assertEquals(2, output.val);
        Assert.assertEquals(3, output.next.val);
        Assert.assertEquals(6, output.next.next.val);
        Assert.assertEquals(7, output.next.next.next.val);
        Assert.assertEquals(1, output.next.next.next.next.val);
        Assert.assertEquals(5, output.next.next.next.next.next.val);
        Assert.assertEquals(4, output.next.next.next.next.next.next.val);
    }
}
