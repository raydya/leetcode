package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountingWordsWithAGivenPrefixTest {

    @Test
    public void test1() {
        final CountingWordsWithAGivenPrefix solution = new CountingWordsWithAGivenPrefix();
        final int output = solution.prefixCount(new String[]{"pay", "attention", "practice", "attend"}, "at");

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final CountingWordsWithAGivenPrefix solution = new CountingWordsWithAGivenPrefix();
        final int output = solution.prefixCount(new String[]{"leetcode", "win", "loops", "success"}, "code");

        Assert.assertEquals(0, output);
    }
}
