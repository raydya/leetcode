package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class PathCrossingTest {

    @Test
    public void test1() {
        final PathCrossing solution = new PathCrossing();
        final boolean output = solution.isPathCrossing("NES");

        Assert.assertFalse(output);
    }

    @Test
    public void test2() {
        final PathCrossing solution = new PathCrossing();
        final boolean output = solution.isPathCrossing("NESWW");

        Assert.assertTrue(output);
    }

    @Test
    public void test3() {
        final PathCrossing solution = new PathCrossing();
        final boolean output = solution.isPathCrossing("S");

        Assert.assertFalse(output);
    }

    @Test
    public void test4() {
        final PathCrossing solution = new PathCrossing();
        final boolean output = solution.isPathCrossing("N");

        Assert.assertFalse(output);
    }

}
