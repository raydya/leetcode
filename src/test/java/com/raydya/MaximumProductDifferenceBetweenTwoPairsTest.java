package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProductDifferenceBetweenTwoPairsTest {

    @Test
    public void test1() {
        final MaximumProductDifferenceBetweenTwoPairs solution = new MaximumProductDifferenceBetweenTwoPairs();
        final int output = solution.maxProductDifference(new int[]{5, 6, 2, 7, 4});

        Assert.assertEquals(34, output);
    }

    @Test
    public void test2() {
        final MaximumProductDifferenceBetweenTwoPairs solution = new MaximumProductDifferenceBetweenTwoPairs();
        final int output = solution.maxProductDifference(new int[]{4, 2, 5, 9, 7, 4, 8});

        Assert.assertEquals(64, output);
    }


}
