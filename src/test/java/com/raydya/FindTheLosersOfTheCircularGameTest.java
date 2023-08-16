package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindTheLosersOfTheCircularGameTest {

    @Test
    public void test1() {
        final FindTheLosersOfTheCircularGame solution = new FindTheLosersOfTheCircularGame();
        final int[] output = solution.circularGameLoser(5, 2);

        Assert.assertArrayEquals(new int[]{4, 5}, output);
    }

    @Test
    public void test2() {
        final FindTheLosersOfTheCircularGame solution = new FindTheLosersOfTheCircularGame();
        final int[] output = solution.circularGameLoser(4, 4);

        Assert.assertArrayEquals(new int[]{2, 3, 4}, output);
    }
}
