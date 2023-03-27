package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindTheHighestAltitudeTest {

    @Test
    public void test1() {
        final FindTheHighestAltitude solution = new FindTheHighestAltitude();
        final int output = solution.largestAltitude(new int[]{-5, 1, 5, 0, -7});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final FindTheHighestAltitude solution = new FindTheHighestAltitude();
        final int output = solution.largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2});

        Assert.assertEquals(0, output);
    }
}
