package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ThreeConsecutiveOddsTest {

    @Test
    public void test1() {
        final ThreeConsecutiveOdds solution = new ThreeConsecutiveOdds();
        final boolean output = solution.threeConsecutiveOdds(new int[]{2, 6, 4, 1});

        Assert.assertFalse(output);
    }

    @Test
    public void test2() {
        final ThreeConsecutiveOdds solution = new ThreeConsecutiveOdds();
        final boolean output = solution.threeConsecutiveOdds(new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12});

        Assert.assertTrue(output);
    }
}
