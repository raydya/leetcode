package com.raydya;

import com.raydya.data.type.ListNode;
import com.raydya.utils.ListNodeUtil;
import org.junit.Assert;
import org.junit.Test;

public class ConvertBinaryNumberInALinkedListToIntegerTest {

    @Test
    public void test1() {
        final ListNode head = ListNodeUtil.build(new int[]{1, 0, 1});

        final ConvertBinaryNumberInALinkedListToInteger solution = new ConvertBinaryNumberInALinkedListToInteger();
        final int output = solution.getDecimalValue(head);

        Assert.assertEquals(5, output);
    }

    @Test
    public void test2() {
        final ListNode head = ListNodeUtil.build(new int[]{0});

        final ConvertBinaryNumberInALinkedListToInteger solution = new ConvertBinaryNumberInALinkedListToInteger();
        final int output = solution.getDecimalValue(head);

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final ListNode head = ListNodeUtil.build(new int[]{1});

        final ConvertBinaryNumberInALinkedListToInteger solution = new ConvertBinaryNumberInALinkedListToInteger();
        final int output = solution.getDecimalValue(head);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test4() {
        final ListNode head = ListNodeUtil.build(
            new int[]{1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0});

        final ConvertBinaryNumberInALinkedListToInteger solution = new ConvertBinaryNumberInALinkedListToInteger();
        final int output = solution.getDecimalValue(head);

        Assert.assertEquals(18880, output);
    }

    @Test
    public void test5() {
        final ListNode head = ListNodeUtil.build(new int[]{0, 0});

        final ConvertBinaryNumberInALinkedListToInteger solution = new ConvertBinaryNumberInALinkedListToInteger();
        final int output = solution.getDecimalValue(head);

        Assert.assertEquals(0, output);
    }
}
