package com.raydya;

import com.raydya.data.type.ListNode;
import com.raydya.utils.ListNodeUtil;
import org.junit.Assert;
import org.junit.Test;

public class ReorderListTest {

    @Test
    public void test1() {
        final ListNode head = ListNodeUtil.build(new int[]{1, 2, 3, 4});

        final ReorderList solution = new ReorderList();
        solution.reorderList(head);

        Assert.assertEquals(1, head.val);
        Assert.assertEquals(4, head.next.val);
        Assert.assertEquals(2, head.next.next.val);
        Assert.assertEquals(3, head.next.next.next.val);
        Assert.assertNull(head.next.next.next.next);
    }

    @Test
    public void test2() {
        final ListNode head = ListNodeUtil.build(new int[]{1, 2, 3, 4, 5});

        final ReorderList solution = new ReorderList();
        solution.reorderList(head);

        Assert.assertEquals(1, head.val);
        Assert.assertEquals(5, head.next.val);
        Assert.assertEquals(2, head.next.next.val);
        Assert.assertEquals(4, head.next.next.next.val);
        Assert.assertEquals(3, head.next.next.next.next.val);
        Assert.assertNull(head.next.next.next.next.next);
    }
}
