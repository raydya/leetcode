package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LongestHarmoniousSubsequenceTest {

    @Test
    public void test1() {
        final LongestHarmoniousSubsequence solution = new LongestHarmoniousSubsequence();
        final int output = solution.findLHS(new int[]{1, 3, 2, 2, 5, 2, 3, 7});

        Assert.assertEquals(5, output);
    }

    @Test
    public void test2() {
        final LongestHarmoniousSubsequence solution = new LongestHarmoniousSubsequence();
        final int output = solution.findLHS(new int[]{1, 2, 3, 4});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final LongestHarmoniousSubsequence solution = new LongestHarmoniousSubsequence();
        final int output = solution.findLHS(new int[]{1, 1, 1, 1});

        Assert.assertEquals(0, output);
    }
}
