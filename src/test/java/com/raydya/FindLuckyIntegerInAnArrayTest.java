package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindLuckyIntegerInAnArrayTest {

    @Test
    public void test1() {
        final FindLuckyIntegerInAnArray solution = new FindLuckyIntegerInAnArray();
        final int output = solution.findLucky(new int[]{2, 2, 3, 4});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final FindLuckyIntegerInAnArray solution = new FindLuckyIntegerInAnArray();
        final int output = solution.findLucky(new int[]{1, 2, 2, 3, 3, 3});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test3() {
        final FindLuckyIntegerInAnArray solution = new FindLuckyIntegerInAnArray();
        final int output = solution.findLucky(new int[]{2, 2, 2, 3, 3});

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test4() {
        final FindLuckyIntegerInAnArray solution = new FindLuckyIntegerInAnArray();
        final int output = solution.findLucky(new int[]{5});

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test5() {
        final FindLuckyIntegerInAnArray solution = new FindLuckyIntegerInAnArray();
        final int output = solution.findLucky(new int[]{7, 7, 7, 7, 7, 7, 7});

        Assert.assertEquals(7, output);
    }
}
