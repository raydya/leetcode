package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CalculateDigitSumOfAStringTest {

    @Test
    public void test1() {
        final CalculateDigitSumOfAString solution = new CalculateDigitSumOfAString();
        final String output = solution.digitSum("11111222223", 3);

        Assert.assertEquals("135", output);
    }

    @Test
    public void test2() {
        final CalculateDigitSumOfAString solution = new CalculateDigitSumOfAString();
        final String output = solution.digitSum("00000000", 3);

        Assert.assertEquals("000", output);
    }
}
