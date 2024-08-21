package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumCutsToDivideACircleTest {

    @Test
    public void test1() {
        final MinimumCutsToDivideACircle solution = new MinimumCutsToDivideACircle();
        final int output = solution.numberOfCuts(4);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final MinimumCutsToDivideACircle solution = new MinimumCutsToDivideACircle();
        final int output = solution.numberOfCuts(3);

        Assert.assertEquals(3, output);
    }
}
