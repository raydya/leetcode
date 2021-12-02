package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DivisorGameTest {
    @Test
    public void test1() {
        DivisorGame solution = new DivisorGame();
        boolean output = solution.divisorGame(2);

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        DivisorGame solution = new DivisorGame();
        boolean output = solution.divisorGame(3);

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        DivisorGame solution = new DivisorGame();
        boolean output = solution.divisorGame(1);

        Assert.assertFalse(output);
    }
}
