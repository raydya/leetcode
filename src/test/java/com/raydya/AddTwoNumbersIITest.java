package com.raydya;

import com.raydya.data.type.ListNode;
import com.raydya.utils.ListNodeUtil;
import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersIITest {

    @Test
    public void test1() {
        final ListNode l1 = ListNodeUtil.build(new int[]{7, 2, 4, 3});
        final ListNode l2 = ListNodeUtil.build(new int[]{5, 6, 4});

        final AddTwoNumbersII solution = new AddTwoNumbersII();
        final ListNode output = solution.addTwoNumbers(l1, l2);

        Assert.assertEquals(7, output.val);
        Assert.assertEquals(8, output.next.val);
        Assert.assertEquals(0, output.next.next.val);
        Assert.assertEquals(7, output.next.next.next.val);
    }

    @Test
    public void test2() {
        final ListNode l1 = ListNodeUtil.build(new int[]{2, 4, 3});
        final ListNode l2 = ListNodeUtil.build(new int[]{5, 6, 4});

        final AddTwoNumbersII solution = new AddTwoNumbersII();
        final ListNode output = solution.addTwoNumbers(l1, l2);

        Assert.assertEquals(8, output.val);
        Assert.assertEquals(0, output.next.val);
        Assert.assertEquals(7, output.next.next.val);
    }

    @Test
    public void test3() {
        final ListNode l1 = ListNodeUtil.build(new int[]{0});
        final ListNode l2 = ListNodeUtil.build(new int[]{0});

        final AddTwoNumbersII solution = new AddTwoNumbersII();
        final ListNode output = solution.addTwoNumbers(l1, l2);

        Assert.assertEquals(0, output.val);
    }

    @Test
    public void test4() {
        final ListNode l1 = ListNodeUtil.build(new int[]{7, 2, 4, 3});
        final ListNode l2 = ListNodeUtil.build(new int[]{5, 6, 4});

        final AddTwoNumbersII solution = new AddTwoNumbersII();
        final ListNode output = solution.addTwoNumbers(l1, l2);

        Assert.assertEquals(7, output.val);
        Assert.assertEquals(8, output.next.val);
        Assert.assertEquals(0, output.next.next.val);
        Assert.assertEquals(7, output.next.next.next.val);
        Assert.assertNull(output.next.next.next.next);
    }

    @Test
    public void test5() {
        final ListNode l1 = ListNodeUtil.build(new int[]{5});
        final ListNode l2 = ListNodeUtil.build(new int[]{5});

        final AddTwoNumbersII solution = new AddTwoNumbersII();
        final ListNode output = solution.addTwoNumbers(l1, l2);

        Assert.assertEquals(1, output.val);
        Assert.assertEquals(0, output.next.val);
        Assert.assertNull(output.next.next);
    }
}
