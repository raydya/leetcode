package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SubstringsOfSizeThreeWithDistinctCharactersTest {

    @Test
    public void test1() {
        final SubstringsOfSizeThreeWithDistinctCharacters solution = new SubstringsOfSizeThreeWithDistinctCharacters();
        final int output = solution.countGoodsSubstrings("xyzzaz");

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final SubstringsOfSizeThreeWithDistinctCharacters solution = new SubstringsOfSizeThreeWithDistinctCharacters();
        final int output = solution.countGoodsSubstrings("aababcabc");

        Assert.assertEquals(4, output);
    }
}
