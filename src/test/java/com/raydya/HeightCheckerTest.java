package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class HeightCheckerTest {

    @Test
    public void test1() {
        final HeightChecker solution = new HeightChecker();
        final int output = solution.heightChecker(new int[]{1, 1, 4, 2, 1, 3});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final HeightChecker solution = new HeightChecker();
        final int output = solution.heightChecker(new int[]{5, 1, 2, 3, 4});

        Assert.assertEquals(5, output);
    }

    @Test
    public void test3() {
        final HeightChecker solution = new HeightChecker();
        final int output = solution.heightChecker(new int[]{1, 2, 3, 4, 5});

        Assert.assertEquals(0, output);
    }
}
