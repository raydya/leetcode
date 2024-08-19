package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfDistinctAveragesTest {

    @Test
    public void test1() {
        final NumberOfDistinctAverages solution = new NumberOfDistinctAverages();
        final int output = solution.distinctAverages(new int[]{4, 1, 4, 0, 3, 5});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final NumberOfDistinctAverages solution = new NumberOfDistinctAverages();
        final int output = solution.distinctAverages(new int[]{1, 100});

        Assert.assertEquals(1, output);
    }
}
