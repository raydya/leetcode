package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ThreeSumClosestTest {
    @Test
    public void test1() {
        final ThreeSumClosest solution = new ThreeSumClosest();
        final int threeSumClosest = solution.threeSumClosest(new int[]{-1, 2, 1, -4}, 1);

        Assert.assertEquals(2, threeSumClosest);
    }

    @Test
    public void test2() {
        final ThreeSumClosest solution = new ThreeSumClosest();
        final int threeSumClosest = solution.threeSumClosest(new int[]{0, 1, 2}, 0);

        Assert.assertEquals(3, threeSumClosest);
    }
}
