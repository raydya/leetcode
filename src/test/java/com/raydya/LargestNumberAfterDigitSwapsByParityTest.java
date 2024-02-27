package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LargestNumberAfterDigitSwapsByParityTest {

    @Test
    public void test1() {
        final LargestNumberAfterDigitSwapsByParity solution = new LargestNumberAfterDigitSwapsByParity();
        final int output = solution.largestInteger(1234);

        Assert.assertEquals(3412, output);
    }

    @Test
    public void test2() {
        final LargestNumberAfterDigitSwapsByParity solution = new LargestNumberAfterDigitSwapsByParity();
        final int output = solution.largestInteger(65875);

        Assert.assertEquals(87655, output);
    }
}
