package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LexicographicallySmallestStringAfterSubstringOperationTest {

    @Test
    public void test1() {
        final LexicographicallySmallestStringAfterSubstringOperation solution = new LexicographicallySmallestStringAfterSubstringOperation();
        final String output = solution.smallestString("cbabc");

        Assert.assertEquals("baabc", output);
    }

    @Test
    public void test2() {
        final LexicographicallySmallestStringAfterSubstringOperation solution = new LexicographicallySmallestStringAfterSubstringOperation();
        final String output = solution.smallestString("acbbc");

        Assert.assertEquals("abaab", output);
    }

    @Test
    public void test3() {
        final LexicographicallySmallestStringAfterSubstringOperation solution = new LexicographicallySmallestStringAfterSubstringOperation();
        final String output = solution.smallestString("leetcode");

        Assert.assertEquals("kddsbncd", output);
    }

    @Test
    public void test4() {
        final LexicographicallySmallestStringAfterSubstringOperation solution = new LexicographicallySmallestStringAfterSubstringOperation();
        final String output = solution.smallestString("aa");

        Assert.assertEquals("az", output);
    }
}
