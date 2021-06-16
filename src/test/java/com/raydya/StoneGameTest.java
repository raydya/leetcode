package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class StoneGameTest {
    @Test
    public void test1() {
        final StoneGame solution = new StoneGame();
        final boolean output = solution.stoneGame(new int[]{5, 3, 4, 5});

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final StoneGame solution = new StoneGame();
        final boolean output = solution.stoneGame(new int[]{3, 7, 2, 3});

        Assert.assertTrue(output);
    }
}
