package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CardFlippingGameTest {

    @Test
    public void test1() {
        final CardFlippingGame solution = new CardFlippingGame();
        final int output = solution.flipgame(new int[]{1, 2, 4, 4, 7}, new int[]{1, 3, 4, 1, 3});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final CardFlippingGame solution = new CardFlippingGame();
        final int output = solution.flipgame(new int[]{1, 1}, new int[]{1, 2});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final CardFlippingGame solution = new CardFlippingGame();
        final int output = solution.flipgame(new int[]{1, 1}, new int[]{2, 2});

        Assert.assertEquals(1, output);
    }
}
