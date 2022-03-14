package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MostCommonWordTest {

    @Test
    public void test1() {
        final MostCommonWord solution = new MostCommonWord();
        final String output = solution.mostCommonWord(
            "Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"});

        Assert.assertEquals("ball", output);
    }

    @Test
    public void test2() {
        final MostCommonWord solution = new MostCommonWord();
        final String output = solution.mostCommonWord("a, a, a, a, b,b,b,c", new String[]{"a"});

        Assert.assertEquals("b", output);
    }
}
