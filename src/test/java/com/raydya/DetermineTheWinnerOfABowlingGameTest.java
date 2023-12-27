package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DetermineTheWinnerOfABowlingGameTest {

    @Test
    public void test1() {
        final DetermineTheWinnerOfABowlingGame solution = new DetermineTheWinnerOfABowlingGame();
        final int output = solution.isWinner(new int[]{4, 10, 7, 9}, new int[]{6, 5, 2, 3});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final DetermineTheWinnerOfABowlingGame solution = new DetermineTheWinnerOfABowlingGame();
        final int output = solution.isWinner(new int[]{3, 5, 7, 6}, new int[]{8, 10, 10, 2});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final DetermineTheWinnerOfABowlingGame solution = new DetermineTheWinnerOfABowlingGame();
        final int output = solution.isWinner(new int[]{2, 3}, new int[]{4, 1});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test4() {
        final DetermineTheWinnerOfABowlingGame solution = new DetermineTheWinnerOfABowlingGame();
        final int output = solution.isWinner(new int[]{2, 3}, new int[]{4, 1});

        Assert.assertEquals(0, output);
    }
}
