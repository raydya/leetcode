package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LongestUncommonSubsequenceITest {
    @Test
    public void test1() {
        final LongestUncommonSubsequenceI solution = new LongestUncommonSubsequenceI();
        final int output = solution.findLUSlength("aba", "cdc");

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final LongestUncommonSubsequenceI solution = new LongestUncommonSubsequenceI();
        final int output = solution.findLUSlength("aaa", "bbb");

        Assert.assertEquals(3, output);
    }

    @Test
    public void test3() {
        final LongestUncommonSubsequenceI solution = new LongestUncommonSubsequenceI();
        final int output = solution.findLUSlength("aaa", "aaa");

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test4() {
        final LongestUncommonSubsequenceI solution = new LongestUncommonSubsequenceI();
        final int output = solution.findLUSlength("aefawfawfawfaw", "aefawfeawfwafwaef");

        Assert.assertEquals(17, output);
    }
}
