package com.raydya;

import com.raydya.data.type.ListNode;
import com.raydya.utils.ListNodeUtil;
import org.junit.Assert;
import org.junit.Test;

public class SortListTest {
    @Test
    public void test1() {
        final ListNode head = ListNodeUtil.build(new int[]{4, 2, 1, 3});
        final SortList solution = new SortList();
        final ListNode output = solution.sortList(head);

        Assert.assertEquals(1, output.val);
        Assert.assertEquals(2, output.next.val);
        Assert.assertEquals(3, output.next.next.val);
        Assert.assertEquals(4, output.next.next.next.val);
        Assert.assertNull(output.next.next.next.next);
    }

    @Test
    public void test2() {
        final ListNode head = ListNodeUtil.build(new int[]{-1, 5, 3, 4, 0});
        final SortList solution = new SortList();
        final ListNode output = solution.sortList(head);

        Assert.assertEquals(-1, output.val);
        Assert.assertEquals(0, output.next.val);
        Assert.assertEquals(3, output.next.next.val);
        Assert.assertEquals(4, output.next.next.next.val);
        Assert.assertEquals(5, output.next.next.next.next.val);
        Assert.assertNull(output.next.next.next.next.next);
    }
}
