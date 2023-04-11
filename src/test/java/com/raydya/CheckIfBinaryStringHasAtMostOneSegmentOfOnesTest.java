package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfBinaryStringHasAtMostOneSegmentOfOnesTest {

    @Test
    public void test1() {
        final CheckIfBinaryStringHasAtMostOneSegmentOfOnes solution = new CheckIfBinaryStringHasAtMostOneSegmentOfOnes();
        final boolean output = solution.checkOneSegment("1001");

        Assert.assertFalse(output);
    }

    @Test
    public void test2() {
        final CheckIfBinaryStringHasAtMostOneSegmentOfOnes solution = new CheckIfBinaryStringHasAtMostOneSegmentOfOnes();
        final boolean output = solution.checkOneSegment("110");

        Assert.assertTrue(output);
    }

    @Test
    public void test3() {
        final CheckIfBinaryStringHasAtMostOneSegmentOfOnes solution = new CheckIfBinaryStringHasAtMostOneSegmentOfOnes();
        final boolean output = solution.checkOneSegment("1000");

        Assert.assertTrue(output);
    }
}
