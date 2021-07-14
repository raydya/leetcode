package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DegreeOfAnArrayTest {
    @Test
    public void test1() {
        final DegreeOfAnArray solution = new DegreeOfAnArray();
        final int output = solution.findShortestSubArray(new int[]{1, 2, 2, 3, 1});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final DegreeOfAnArray solution = new DegreeOfAnArray();
        final int output = solution.findShortestSubArray(new int[]{1, 2, 2, 3, 1, 4, 2});

        Assert.assertEquals(6, output);
    }
}
