package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfWordEqualsSummationOfTwoWordsTest {

    @Test
    public void test1() {
        final CheckIfWordEqualsSummationOfTwoWords solution = new CheckIfWordEqualsSummationOfTwoWords();
        final boolean output = solution.isSumEqual("acb", "cba", "cdb");

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final CheckIfWordEqualsSummationOfTwoWords solution = new CheckIfWordEqualsSummationOfTwoWords();
        final boolean output = solution.isSumEqual("aaa", "a", "aab");

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final CheckIfWordEqualsSummationOfTwoWords solution = new CheckIfWordEqualsSummationOfTwoWords();
        final boolean output = solution.isSumEqual("aaa", "a", "aaaa");

        Assert.assertTrue(output);
    }
}
