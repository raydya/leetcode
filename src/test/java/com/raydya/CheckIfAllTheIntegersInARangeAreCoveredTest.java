package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfAllTheIntegersInARangeAreCoveredTest {
    @Test
    public void test1() {
        final CheckIfAllTheIntegersInARangeAreCovered solution = new CheckIfAllTheIntegersInARangeAreCovered();
        final boolean output = solution.isCovered(new int[][]{{1, 2}, {3, 4}, {5, 6}}, 2, 5);

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final CheckIfAllTheIntegersInARangeAreCovered solution = new CheckIfAllTheIntegersInARangeAreCovered();
        final boolean output = solution.isCovered(new int[][]{{1, 10}, {10, 20}}, 21, 21);

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final CheckIfAllTheIntegersInARangeAreCovered solution = new CheckIfAllTheIntegersInARangeAreCovered();
        final boolean output = solution.isCovered(new int[][]{{1, 50}}, 1, 50);

        Assert.assertTrue(output);
    }
}
