package com.raydya;

import com.raydya.data.type.ListNode;
import com.raydya.utils.ListNodeUtil;
import org.junit.Assert;
import org.junit.Test;

public class MiddleOfTheLinkedListTest {

    @Test
    public void test1() {
        final ListNode head = ListNodeUtil.build(new int[]{1, 2, 3, 4, 5});

        final MiddleOfTheLinkedList solution = new MiddleOfTheLinkedList();
        final ListNode output = solution.middleNode(head);

        Assert.assertEquals(head.next.next, output);
    }

    @Test
    public void test2() {
        final ListNode head = ListNodeUtil.build(new int[]{1, 2, 3, 4, 5, 6});

        final MiddleOfTheLinkedList solution = new MiddleOfTheLinkedList();
        final ListNode output = solution.middleNode(head);

        Assert.assertEquals(head.next.next.next, output);
    }
}
