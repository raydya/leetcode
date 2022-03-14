package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaxConsecutiveOnesTest {

    @Test
    public void test1() {
        final MaxConsecutiveOnes solution = new MaxConsecutiveOnes();
        final int output = solution.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final MaxConsecutiveOnes solution = new MaxConsecutiveOnes();
        final int output = solution.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final MaxConsecutiveOnes solution = new MaxConsecutiveOnes();
        final int output = solution.findMaxConsecutiveOnes(new int[]{1});

        Assert.assertEquals(1, output);
    }
}
