package com.raydya.utils;

import com.raydya.data.type.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class ListNodeUtilTest {

    @Test
    public void test1() {
        final ListNode head = ListNodeUtil.build(new int[]{4, 2, 1, 3});

        Assert.assertEquals(4, head.val);
        Assert.assertEquals(2, head.next.val);
        Assert.assertEquals(1, head.next.next.val);
        Assert.assertEquals(3, head.next.next.next.val);
    }

    @Test
    public void test2() {
        final ListNode head = ListNodeUtil.build(new int[]{-1, 5, 3, 4, 0});

        Assert.assertEquals(-1, head.val);
        Assert.assertEquals(5, head.next.val);
        Assert.assertEquals(3, head.next.next.val);
        Assert.assertEquals(4, head.next.next.next.val);
        Assert.assertEquals(0, head.next.next.next.next.val);
    }
}
