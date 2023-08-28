package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SmallestIndexWithEqualValueTest {

    @Test
    public void test1() {
        final SmallestIndexWithEqualValue solution = new SmallestIndexWithEqualValue();
        final int output = solution.smallestEqual(new int[]{0, 1, 2});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test2() {
        final SmallestIndexWithEqualValue solution = new SmallestIndexWithEqualValue();
        final int output = solution.smallestEqual(new int[]{4, 3, 2, 1});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final SmallestIndexWithEqualValue solution = new SmallestIndexWithEqualValue();
        final int output = solution.smallestEqual(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test4() {
        final SmallestIndexWithEqualValue solution = new SmallestIndexWithEqualValue();
        final int output = solution.smallestEqual(new int[]{2, 1, 3, 5, 2});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test5() {
        final SmallestIndexWithEqualValue solution = new SmallestIndexWithEqualValue();
        final int output = solution.smallestEqual(
            new int[]{7, 8, 3, 5, 2, 6, 3, 1, 1, 4, 5, 4, 8, 7, 2, 0, 9, 9, 0, 5, 7, 1, 6});

        Assert.assertEquals(21, output);
    }
}
