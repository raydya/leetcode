package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountPrefixesOfAGivenStringTest {

    @Test
    public void test1() {
        final CountPrefixesOfAGivenString solution = new CountPrefixesOfAGivenString();
        final int output = solution.countPrefixes(
            new String[]{
                "a", "b", "c", "ab", "bc", "abc"
            },
            "abc");

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final CountPrefixesOfAGivenString solution = new CountPrefixesOfAGivenString();
        final int output = solution.countPrefixes(
            new String[]{
                "a", "a"
            },
            "aa");

        Assert.assertEquals(2, output);
    }
}
