package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LongestUncommonSubsequenceIITest {

    @Test
    public void test1() {
        final LongestUncommonSubsequenceII solution = new LongestUncommonSubsequenceII();
        final int output = solution.findLUSlength(new String[]{"aba", "cdc", "eae"});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final LongestUncommonSubsequenceII solution = new LongestUncommonSubsequenceII();
        final int output = solution.findLUSlength(new String[]{"aaa", "aaa", "aa"});

        Assert.assertEquals(-1, output);
    }
}
