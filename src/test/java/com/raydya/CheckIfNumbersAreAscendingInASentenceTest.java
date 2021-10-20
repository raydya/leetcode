package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfNumbersAreAscendingInASentenceTest {
    @Test
    public void test1() {
        final CheckIfNumbersAreAscendingInASentence solution = new CheckIfNumbersAreAscendingInASentence();
        final boolean output = solution.areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles");

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final CheckIfNumbersAreAscendingInASentence solution = new CheckIfNumbersAreAscendingInASentence();
        final boolean output = solution.areNumbersAscending("hello world 5 x 5");

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final CheckIfNumbersAreAscendingInASentence solution = new CheckIfNumbersAreAscendingInASentence();
        final boolean output = solution.areNumbersAscending("sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s");

        Assert.assertFalse(output);
    }

    @Test
    public void test4() {
        final CheckIfNumbersAreAscendingInASentence solution = new CheckIfNumbersAreAscendingInASentence();
        final boolean output = solution.areNumbersAscending("4 5 11 26");

        Assert.assertTrue(output);
    }
}
