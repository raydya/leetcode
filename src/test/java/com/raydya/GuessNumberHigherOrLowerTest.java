package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class GuessNumberHigherOrLowerTest {

    @Test
    public void test1() {
        final GuessNumberHigherOrLower solution = new GuessNumberHigherOrLower();
        final int number = solution.guessNumber(10, 6);

        Assert.assertEquals(6, number);
    }

    @Test
    public void test2() {
        final GuessNumberHigherOrLower solution = new GuessNumberHigherOrLower();
        final int number = solution.guessNumber(1, 1);

        Assert.assertEquals(1, number);
    }

    @Test
    public void test3() {
        final GuessNumberHigherOrLower solution = new GuessNumberHigherOrLower();
        final int number = solution.guessNumber(2, 1);

        Assert.assertEquals(1, number);
    }

    @Test
    public void test4() {
        final GuessNumberHigherOrLower solution = new GuessNumberHigherOrLower();
        final int number = solution.guessNumber(2, 2);

        Assert.assertEquals(2, number);
    }

    @Test
    public void test5() {
        final GuessNumberHigherOrLower solution = new GuessNumberHigherOrLower();
        final int number = solution.guessNumber(2126753390, 1702766719);

        Assert.assertEquals(1702766719, number);
    }
}
