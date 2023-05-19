package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LetterTilePossibilitiesTest {

    @Test
    public void test1() {
        final LetterTilePossibilities solution = new LetterTilePossibilities();
        final int output = solution.numTilePossibilities("AAB");

        Assert.assertEquals(8, output);
    }

    @Test
    public void test2() {
        final LetterTilePossibilities solution = new LetterTilePossibilities();
        final int output = solution.numTilePossibilities("AAABBC");

        Assert.assertEquals(188, output);
    }

    @Test
    public void test3() {
        final LetterTilePossibilities solution = new LetterTilePossibilities();
        final int output = solution.numTilePossibilities("V");

        Assert.assertEquals(1, output);
    }
}
