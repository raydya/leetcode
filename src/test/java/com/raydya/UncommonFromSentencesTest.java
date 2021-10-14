package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class UncommonFromSentencesTest {
    @Test
    public void test1() {
        final UncommonFromSentences solution = new UncommonFromSentences();
        final String[] output = solution.uncommonFromSentences("this apple is sweet", "this apple is sour");

        Assert.assertArrayEquals(new String[]{"sweet", "sour"}, output);
    }

    @Test
    public void test2() {
        final UncommonFromSentences solution = new UncommonFromSentences();
        final String[] output = solution.uncommonFromSentences("apple apple", "banana");

        Assert.assertArrayEquals(new String[]{"banana"}, output);
    }

    @Test
    public void test3() {
        final UncommonFromSentences solution = new UncommonFromSentences();
        final String[] output = solution.uncommonFromSentences("s z z z s", "s z ejt");

        Assert.assertArrayEquals(new String[]{"ejt"}, output);
    }
}
