package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class BigramTest {
    @Test
    public void test1() {
        final Bigram solution = new Bigram();
        final String[] output = solution.findOcurrences("alice is a good girl she is a good student", "a", "good");

        Assert.assertArrayEquals(new String[]{"girl", "student"}, output);
    }

    @Test
    public void test2() {
        final Bigram solution = new Bigram();
        final String[] output = solution.findOcurrences("we will we will rock you", "we", "will");

        Assert.assertArrayEquals(new String[]{"we", "rock"}, output);
    }
}
