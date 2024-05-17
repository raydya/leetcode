package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MostProfitAssigningWorkTest {

    @Test
    public void test1() {
        final MostProfitAssigningWork solution = new MostProfitAssigningWork();
        final int output = solution.maxProfitAssignment(
            new int[]{2, 4, 6, 8, 10},
            new int[]{10, 20, 30, 40, 50},
            new int[]{4, 5, 6, 7});

        Assert.assertEquals(100, output);
    }

    @Test
    public void test2() {
        final MostProfitAssigningWork solution = new MostProfitAssigningWork();
        final int output = solution.maxProfitAssignment(
            new int[]{85, 47, 57},
            new int[]{24, 66, 99},
            new int[]{40, 25, 25}
        );

        Assert.assertEquals(0, output);
    }
}
