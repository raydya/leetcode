package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class XOfAKindInADeckOfCardsTest {

    @Test
    public void test1() {
        final XOfAKindInADeckOfCards solution = new XOfAKindInADeckOfCards();
        final boolean output = solution.hasGroupsSizeX(new int[]{1, 2, 3, 4, 4, 3, 2, 1});

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final XOfAKindInADeckOfCards solution = new XOfAKindInADeckOfCards();
        final boolean output = solution.hasGroupsSizeX(new int[]{1, 1, 1, 2, 2, 2, 3, 3});

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final XOfAKindInADeckOfCards solution = new XOfAKindInADeckOfCards();
        final boolean output = solution.hasGroupsSizeX(new int[]{1});

        Assert.assertFalse(output);
    }

    @Test
    public void test4() {
        final XOfAKindInADeckOfCards solution = new XOfAKindInADeckOfCards();
        final boolean output = solution.hasGroupsSizeX(new int[]{1, 1});

        Assert.assertTrue(output);
    }

    @Test
    public void test5() {
        final XOfAKindInADeckOfCards solution = new XOfAKindInADeckOfCards();
        final boolean output = solution.hasGroupsSizeX(new int[]{1, 1, 2, 2, 2, 2});

        Assert.assertTrue(output);
    }
}
