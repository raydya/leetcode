package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinMaxGameTest {

    @Test
    public void test1() {
        final MinMaxGame solution = new MinMaxGame();
        final int output = solution.minMaxGame(new int[]{1, 3, 5, 2, 4, 8, 2, 2});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final MinMaxGame solution = new MinMaxGame();
        final int output = solution.minMaxGame(new int[]{3});

        Assert.assertEquals(3, output);
    }
}
