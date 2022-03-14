package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class OneBitAndTwoBitCharactersTest {

    @Test
    public void test1() {
        final OneBitAndTwoBitCharacters solution = new OneBitAndTwoBitCharacters();
        final boolean output = solution.isOneBitCharacter(new int[]{1, 0, 0});

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final OneBitAndTwoBitCharacters solution = new OneBitAndTwoBitCharacters();
        final boolean output = solution.isOneBitCharacter(new int[]{1, 1, 1, 0});

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final OneBitAndTwoBitCharacters solution = new OneBitAndTwoBitCharacters();
        final boolean output = solution.isOneBitCharacter(new int[]{1, 1, 0});

        Assert.assertTrue(output);
    }
}
