package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountCommonWordsWithOneOccurrenceTest {

    @Test
    public void test1() {
        final CountCommonWordsWithOneOccurrence solution = new CountCommonWordsWithOneOccurrence();
        final int output = solution.countWords(new String[]{"leetcode", "is", "amazing", "as", "is"},
            new String[]{"amazing", "leetcode", "is"});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final CountCommonWordsWithOneOccurrence solution = new CountCommonWordsWithOneOccurrence();
        final int output = solution.countWords(new String[]{"b", "bb", "bbb"},
            new String[]{"a", "aa", "aaa"});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final CountCommonWordsWithOneOccurrence solution = new CountCommonWordsWithOneOccurrence();
        final int output = solution.countWords(new String[]{"a", "ab"},
            new String[]{"a", "a", "a", "ab"});

        Assert.assertEquals(1, output);
    }
}
