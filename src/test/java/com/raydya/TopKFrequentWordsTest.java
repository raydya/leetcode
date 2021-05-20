package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TopKFrequentWordsTest {
    @Test
    public void test1() {
        final String[] words = {"i", "love", "leetcode", "i", "love", "coding"};

        final TopKFrequentWords solution = new TopKFrequentWords();
        final List<String> output = solution.topKFrequent(words, 2);

        Assert.assertArrayEquals(new String[]{"i", "love"}, output.toArray());
    }

    @Test
    public void test2() {
        final String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};

        final TopKFrequentWords solution = new TopKFrequentWords();
        final List<String> output = solution.topKFrequent(words, 4);

        Assert.assertArrayEquals(new String[]{"the", "is", "sunny", "day"}, output.toArray());
    }
}
