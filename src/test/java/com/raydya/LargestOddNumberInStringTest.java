package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LargestOddNumberInStringTest {

    @Test
    public void test1() {
        final LargestOddNumberInString solution = new LargestOddNumberInString();
        final String output = solution.largestOddNumber("52");

        Assert.assertEquals("5", output);
    }

    @Test
    public void test2() {
        final LargestOddNumberInString solution = new LargestOddNumberInString();
        final String output = solution.largestOddNumber("4206");

        Assert.assertEquals("", output);
    }

    @Test
    public void test3() {
        final LargestOddNumberInString solution = new LargestOddNumberInString();
        final String output = solution.largestOddNumber("35427");

        Assert.assertEquals("35427", output);
    }
}
