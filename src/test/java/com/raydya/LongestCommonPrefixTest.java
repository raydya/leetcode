package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {

    @Test
    public void test1() {
        String[] input = new String[]{"flower", "flow", "flight"};

        final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        final String output = longestCommonPrefix.longestCommonPrefix(input);

        Assert.assertEquals("fl", output);
    }

    @Test
    public void test2() {
        String[] input = new String[]{"dog", "racecar", "car"};

        final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        final String output = longestCommonPrefix.longestCommonPrefix(input);

        Assert.assertEquals("", output);
    }

    @Test
    public void test3() {
        String[] input = new String[]{};

        final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        final String output = longestCommonPrefix.longestCommonPrefix(input);

        Assert.assertEquals("", output);
    }

    @Test
    public void test4() {
        String[] input = new String[]{"ca", "a"};

        final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        final String output = longestCommonPrefix.longestCommonPrefix(input);

        Assert.assertEquals("", output);
    }
}
