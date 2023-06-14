package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SumOfDigitsOfStringAfterConvertTest {

    @Test
    public void test1() {
        final SumOfDigitsOfStringAfterConvert solution = new SumOfDigitsOfStringAfterConvert();
        final int output = solution.getLucky("iiii", 1);

        Assert.assertEquals(36, output);
    }

    @Test
    public void test2() {
        final SumOfDigitsOfStringAfterConvert solution = new SumOfDigitsOfStringAfterConvert();
        final int output = solution.getLucky("leetcode", 2);

        Assert.assertEquals(6, output);
    }
}
