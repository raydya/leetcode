package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NimGameTest {
    @Test
    public void test1() {
        final NimGame solution = new NimGame();
        final boolean canWinNim = solution.canWinNim(4);

        Assert.assertFalse(canWinNim);
    }

    @Test
    public void test2() {
        final NimGame solution = new NimGame();
        final boolean canWinNim = solution.canWinNim(1);

        Assert.assertTrue(canWinNim);
    }

    @Test
    public void test3() {
        final NimGame solution = new NimGame();
        final boolean canWinNim = solution.canWinNim(2);

        Assert.assertTrue(canWinNim);
    }

    @Test
    public void test4() {
        final NimGame solution = new NimGame();
        final boolean canWinNim = solution.canWinNim(8);

        Assert.assertFalse(canWinNim);
    }
}
