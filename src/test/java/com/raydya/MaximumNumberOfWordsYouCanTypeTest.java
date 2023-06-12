package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberOfWordsYouCanTypeTest {

    @Test
    public void test1() {
        final MaximumNumberOfWordsYouCanType solution = new MaximumNumberOfWordsYouCanType();
        final int output = solution.canBeTypeWords("hello world", "ad");

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final MaximumNumberOfWordsYouCanType solution = new MaximumNumberOfWordsYouCanType();
        final int output = solution.canBeTypeWords("leet code", "lt");

        Assert.assertEquals(1, output);
    }

    @Test
    public void test3() {
        final MaximumNumberOfWordsYouCanType solution = new MaximumNumberOfWordsYouCanType();
        final int output = solution.canBeTypeWords("leet code", "e");

        Assert.assertEquals(0, output);
    }
}
