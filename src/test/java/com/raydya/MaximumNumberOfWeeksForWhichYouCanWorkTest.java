package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberOfWeeksForWhichYouCanWorkTest {

    @Test
    public void test1() {
        final MaximumNumberOfWeeksForWhichYouCanWork solution = new MaximumNumberOfWeeksForWhichYouCanWork();
        final long output = solution.numberOfWeeks(new int[]{1, 2, 3});

        Assert.assertEquals(6, output);
    }

    @Test
    public void test2() {
        final MaximumNumberOfWeeksForWhichYouCanWork solution = new MaximumNumberOfWeeksForWhichYouCanWork();
        final long output = solution.numberOfWeeks(new int[]{5, 2, 1});

        Assert.assertEquals(7, output);
    }
}
