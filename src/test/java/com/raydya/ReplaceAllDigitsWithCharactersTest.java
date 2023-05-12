package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ReplaceAllDigitsWithCharactersTest {

    @Test
    public void test1() {
        final ReplaceAllDigitsWithCharacters solution = new ReplaceAllDigitsWithCharacters();
        final String output = solution.replaceDigits("a1c1e1");

        Assert.assertEquals("abcdef", output);
    }

    @Test
    public void test2() {
        final ReplaceAllDigitsWithCharacters solution = new ReplaceAllDigitsWithCharacters();
        final String output = solution.replaceDigits("a1b2c3d4e");

        Assert.assertEquals("abbdcfdhe", output);
    }
}
