package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumBitFlipsToConvertNumberTest {

    @Test
    public void test1() {
        final MinimumBitFlipsToConvertNumber solution = new MinimumBitFlipsToConvertNumber();
        final int output = solution.minBitFlips(10, 7);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final MinimumBitFlipsToConvertNumber solution = new MinimumBitFlipsToConvertNumber();
        final int output = solution.minBitFlips(3, 4);

        Assert.assertEquals(3, output);
    }
}
