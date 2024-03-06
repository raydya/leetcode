package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindTheKOrOfAnArrayTest {

    @Test
    public void test1() {
        final FindTheKOrOfAnArray solution = new FindTheKOrOfAnArray();
        final int output = solution.findKOr(new int[]{7, 12, 9, 8, 9, 15}, 4);

        Assert.assertEquals(9, output);
    }

    @Test
    public void test2() {
        final FindTheKOrOfAnArray solution = new FindTheKOrOfAnArray();
        final int output = solution.findKOr(new int[]{2, 12, 1, 11, 4, 5}, 6);

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final FindTheKOrOfAnArray solution = new FindTheKOrOfAnArray();
        final int output = solution.findKOr(new int[]{10, 8, 5, 9, 11, 6, 8}, 1);

        Assert.assertEquals(15, output);
    }

    @Test
    public void test4() {
        final FindTheKOrOfAnArray solution = new FindTheKOrOfAnArray();
        final int output = solution.findKOr(new int[]{2}, 1);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test5() {
        final FindTheKOrOfAnArray solution = new FindTheKOrOfAnArray();
        final int output = solution.findKOr(new int[]{14, 28, 23, 22}, 2);

        Assert.assertEquals(30, output);
    }
}
