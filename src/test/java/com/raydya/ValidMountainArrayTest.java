package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ValidMountainArrayTest {

    @Test
    public void test1() {
        final ValidMountainArray solution = new ValidMountainArray();
        final boolean output = solution.validMountainArray(new int[]{2, 1});

        Assert.assertFalse(output);
    }

    @Test
    public void test2() {
        final ValidMountainArray solution = new ValidMountainArray();
        final boolean output = solution.validMountainArray(new int[]{3, 5, 5});

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final ValidMountainArray solution = new ValidMountainArray();
        final boolean output = solution.validMountainArray(new int[]{0, 3, 2, 1});

        Assert.assertTrue(output);
    }

    @Test
    public void test4() {
        final ValidMountainArray solution = new ValidMountainArray();
        final boolean output = solution.validMountainArray(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});

        Assert.assertFalse(output);
    }

    @Test
    public void test5() {
        final ValidMountainArray solution = new ValidMountainArray();
        final boolean output = solution.validMountainArray(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0});

        Assert.assertFalse(output);
    }

    @Test
    public void test6() {
        final ValidMountainArray solution = new ValidMountainArray();
        final boolean output = solution.validMountainArray(new int[]{1, 7, 9, 5, 4, 1, 2});

        Assert.assertFalse(output);
    }
}
