package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LargestSubstringBetweenTwoEqualCharactersTest {

    @Test
    public void test1() {
        final LargestSubstringBetweenTwoEqualCharacters solution = new LargestSubstringBetweenTwoEqualCharacters();
        final int output = solution.maxLengthBetweenEqualCharacters("aa");

        Assert.assertEquals(0, output);
    }

    @Test
    public void test2() {
        final LargestSubstringBetweenTwoEqualCharacters solution = new LargestSubstringBetweenTwoEqualCharacters();
        final int output = solution.maxLengthBetweenEqualCharacters("abca");

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final LargestSubstringBetweenTwoEqualCharacters solution = new LargestSubstringBetweenTwoEqualCharacters();
        final int output = solution.maxLengthBetweenEqualCharacters("cbzxy");

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test4() {
        final LargestSubstringBetweenTwoEqualCharacters solution = new LargestSubstringBetweenTwoEqualCharacters();
        final int output = solution.maxLengthBetweenEqualCharacters("cabbac");

        Assert.assertEquals(4, output);
    }

    @Test
    public void test5() {
        final LargestSubstringBetweenTwoEqualCharacters solution = new LargestSubstringBetweenTwoEqualCharacters();
        final int output = solution.maxLengthBetweenEqualCharacters("ojdncpvyneq");

        Assert.assertEquals(4, output);
    }
}
