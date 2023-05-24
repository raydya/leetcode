package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LongerContiguousSegmentsOfOnesThanZerosTest {

    @Test
    public void test1() {
        final LongerContiguousSegmentsOfOnesThanZeros solution = new LongerContiguousSegmentsOfOnesThanZeros();
        final boolean output = solution.checkZeroOnes("1101");

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final LongerContiguousSegmentsOfOnesThanZeros solution = new LongerContiguousSegmentsOfOnesThanZeros();
        final boolean output = solution.checkZeroOnes("111000");

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final LongerContiguousSegmentsOfOnesThanZeros solution = new LongerContiguousSegmentsOfOnesThanZeros();
        final boolean output = solution.checkZeroOnes("110100010");

        Assert.assertFalse(output);
    }
}
