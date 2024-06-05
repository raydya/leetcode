package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class BestPokerHandTest {

    @Test
    public void test1() {
        final BestPokerHand solution = new BestPokerHand();
        final String output = solution.bestHand(new int[]{13, 2, 3, 1, 9}, new char[]{'a', 'a', 'a', 'a', 'a'});

        Assert.assertEquals("Flush", output);
    }

    @Test
    public void test2() {
        final BestPokerHand solution = new BestPokerHand();
        final String output = solution.bestHand(new int[]{4, 4, 2, 4, 4}, new char[]{'d', 'a', 'a', 'b', 'c'});

        Assert.assertEquals("Three of a Kind", output);
    }

    @Test
    public void test3() {
        final BestPokerHand solution = new BestPokerHand();
        final String output = solution.bestHand(new int[]{10, 10, 2, 12, 9}, new char[]{'a', 'b', 'c', 'a', 'd'});

        Assert.assertEquals("Pair", output);
    }
}
