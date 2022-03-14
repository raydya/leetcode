package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class TruncateSentenceTest {

    @Test
    public void test1() {
        final TruncateSentence solution = new TruncateSentence();
        final String output = solution.truncateSentence("Hello how are you Contestant", 4);

        Assert.assertEquals("Hello how are you", output);
    }

    @Test
    public void test2() {
        final TruncateSentence solution = new TruncateSentence();
        final String output = solution.truncateSentence("What is the solution to this problem", 4);

        Assert.assertEquals("What is the solution", output);
    }

    @Test
    public void test3() {
        final TruncateSentence solution = new TruncateSentence();
        final String output = solution.truncateSentence("chopper is not a tanuki", 5);

        Assert.assertEquals("chopper is not a tanuki", output);
    }
}
