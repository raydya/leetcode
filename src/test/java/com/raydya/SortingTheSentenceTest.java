package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SortingTheSentenceTest {

    @Test
    public void test1() {
        final SortingTheSentence solution = new SortingTheSentence();
        final String output = solution.sortSentence("is2 sentence4 This1 a3");

        Assert.assertEquals("This is a sentence", output);
    }

    @Test
    public void test2() {
        final SortingTheSentence solution = new SortingTheSentence();
        final String output = solution.sortSentence("Myself2 Me1 I4 and3");

        Assert.assertEquals("Me Myself and I", output);
    }
}
