package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountHillsAndValleysInAnArrayTest {

    @Test
    public void test1() {
        final CountHillsAndValleysInAnArray solution = new CountHillsAndValleysInAnArray();
        final int output = solution.countHillValley(new int[]{2, 4, 1, 1, 6, 5});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final CountHillsAndValleysInAnArray solution = new CountHillsAndValleysInAnArray();
        final int output = solution.countHillValley(new int[]{6, 6, 5, 5, 4, 1});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final CountHillsAndValleysInAnArray solution = new CountHillsAndValleysInAnArray();
        final int output = solution.countHillValley(new int[]{6, 5, 10});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test4() {
        final CountHillsAndValleysInAnArray solution = new CountHillsAndValleysInAnArray();
        final int output = solution.countHillValley(new int[]{5, 7, 7, 1, 7});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test5() {
        final CountHillsAndValleysInAnArray solution = new CountHillsAndValleysInAnArray();
        final int output = solution.countHillValley(
            new int[]{57, 57, 57, 57, 57, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 85, 85,
                85, 86, 86, 86});

        Assert.assertEquals(2, output);
    }
}
