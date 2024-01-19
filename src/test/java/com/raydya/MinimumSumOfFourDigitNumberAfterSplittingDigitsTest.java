package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumSumOfFourDigitNumberAfterSplittingDigitsTest {

    @Test
    public void test1() {
        final MinimumSumOfFourDigitNumberAfterSplittingDigits solution = new MinimumSumOfFourDigitNumberAfterSplittingDigits();
        final int output = solution.minimumSum(2932);

        Assert.assertEquals(52, output);
    }

    @Test
    public void test2() {
        final MinimumSumOfFourDigitNumberAfterSplittingDigits solution = new MinimumSumOfFourDigitNumberAfterSplittingDigits();
        final int output = solution.minimumSum(4009);

        Assert.assertEquals(13, output);
    }
}
