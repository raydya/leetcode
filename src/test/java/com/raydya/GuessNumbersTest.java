package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class GuessNumbersTest {
    @Test
    public void test1() {
        final GuessNumbers solution = new GuessNumbers();
        final int output = solution.game(new int[]{1, 2, 3}, new int[]{1, 2, 3});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final GuessNumbers solution = new GuessNumbers();
        final int output = solution.game(new int[]{2, 2, 3}, new int[]{3, 2, 1});

        Assert.assertEquals(1, output);
    }
}
