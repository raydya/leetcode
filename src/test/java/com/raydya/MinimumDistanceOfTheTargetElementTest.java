package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumDistanceOfTheTargetElementTest {

    @Test
    public void test1() {
        final MinimumDistanceOfTheTargetElement solution = new MinimumDistanceOfTheTargetElement();
        final int output = solution.getMinDistance(new int[]{1, 2, 3, 4, 5}, 5, 3);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final MinimumDistanceOfTheTargetElement solution = new MinimumDistanceOfTheTargetElement();
        final int output = solution.getMinDistance(new int[]{1}, 1, 0);

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final MinimumDistanceOfTheTargetElement solution = new MinimumDistanceOfTheTargetElement();
        final int output = solution.getMinDistance(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 1, 0);

        Assert.assertEquals(0, output);
    }
}
