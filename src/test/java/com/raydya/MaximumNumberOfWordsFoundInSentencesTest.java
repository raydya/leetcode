package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberOfWordsFoundInSentencesTest {

    @Test
    public void test1() {
        final MaximumNumberOfWordsFoundInSentences solution = new MaximumNumberOfWordsFoundInSentences();
        final int output = solution.mostWordsFound(
            new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"});

        Assert.assertEquals(6, output);
    }

    @Test
    public void test2() {
        final MaximumNumberOfWordsFoundInSentences solution = new MaximumNumberOfWordsFoundInSentences();
        final int output = solution.mostWordsFound(
            new String[]{"please wait", "continue to fight", "continue to win"});

        Assert.assertEquals(3, output);
    }
}
