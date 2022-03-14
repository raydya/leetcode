package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LastStoneWeightTest {

    @Test
    public void test1() {
        final LastStoneWeight solution = new LastStoneWeight();
        final int output = solution.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final LastStoneWeight solution = new LastStoneWeight();
        final int output = solution.lastStoneWeight(new int[]{7, 6, 7, 6, 9});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test3() {
        final LastStoneWeight solution = new LastStoneWeight();
        final int output = solution.lastStoneWeight(new int[]{1});

        Assert.assertEquals(1, output);
    }
}
