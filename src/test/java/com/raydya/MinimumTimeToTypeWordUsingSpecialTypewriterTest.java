package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumTimeToTypeWordUsingSpecialTypewriterTest {

    @Test
    public void test1() {
        final MinimumTimeToTypeWordUsingSpecialTypewriter solution = new MinimumTimeToTypeWordUsingSpecialTypewriter();
        final int output = solution.minTimeToType("abc");

        Assert.assertEquals(5, output);
    }

    @Test
    public void test2() {
        final MinimumTimeToTypeWordUsingSpecialTypewriter solution = new MinimumTimeToTypeWordUsingSpecialTypewriter();
        final int output = solution.minTimeToType("bza");

        Assert.assertEquals(7, output);
    }

    @Test
    public void test3() {
        final MinimumTimeToTypeWordUsingSpecialTypewriter solution = new MinimumTimeToTypeWordUsingSpecialTypewriter();
        final int output = solution.minTimeToType("zjpc");

        Assert.assertEquals(34, output);
    }
}
