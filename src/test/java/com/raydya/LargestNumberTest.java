package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LargestNumberTest {
    @Test
    public void test1() {
        final LargestNumber solution = new LargestNumber();
        final String output = solution.largestNumber(new int[]{10, 2});

        Assert.assertEquals("210", output);
    }

    @Test
    public void test2() {
        final LargestNumber solution = new LargestNumber();
        final String output = solution.largestNumber(new int[]{3, 30, 34, 5, 9});

        Assert.assertEquals("9534330", output);
    }

    @Test
    public void test3() {
        final LargestNumber solution = new LargestNumber();
        final String output = solution.largestNumber(new int[]{1});

        Assert.assertEquals("1", output);
    }

    @Test
    public void test4() {
        final LargestNumber solution = new LargestNumber();
        final String output = solution.largestNumber(new int[]{10});

        Assert.assertEquals("10", output);
    }

    @Test
    public void test5() {
        final LargestNumber solution = new LargestNumber();
        final String output = solution.largestNumber(new int[]{34323, 3432});

        Assert.assertEquals("343234323", output);
    }

    @Test
    public void test6() {
        final LargestNumber solution = new LargestNumber();
        final String output = solution.largestNumber(new int[]{432, 43243});

        Assert.assertEquals("43243432", output);
    }

    @Test
    public void test7() {
        final LargestNumber solution = new LargestNumber();
        final String output = solution.largestNumber(new int[]{0, 0});

        Assert.assertEquals("0", output);
    }
}
