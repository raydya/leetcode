package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SumOfAllSubsetXorTotalsTest {

    @Test
    public void test1() {
        final SumOfAllSubsetXorTotals solution = new SumOfAllSubsetXorTotals();
        final int output = solution.subsetXORSum(new int[]{1, 3});

        Assert.assertEquals(6, output);
    }

    @Test
    public void test2() {
        final SumOfAllSubsetXorTotals solution = new SumOfAllSubsetXorTotals();
        final int output = solution.subsetXORSum(new int[]{5, 1, 6});

        Assert.assertEquals(28, output);
    }

    @Test
    public void test3() {
        final SumOfAllSubsetXorTotals solution = new SumOfAllSubsetXorTotals();
        final int output = solution.subsetXORSum(new int[]{3, 4, 5, 6, 7, 8});

        Assert.assertEquals(480, output);
    }
}
