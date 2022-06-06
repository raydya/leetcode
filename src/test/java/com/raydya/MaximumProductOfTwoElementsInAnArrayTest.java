package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProductOfTwoElementsInAnArrayTest {

    @Test
    public void test1() {
        final MaximumProductOfTwoElementsInAnArray solution = new MaximumProductOfTwoElementsInAnArray();
        final int output = solution.maxProduct(new int[]{3, 4, 5, 2});

        Assert.assertEquals(12, output);
    }

    @Test
    public void test2() {
        final MaximumProductOfTwoElementsInAnArray solution = new MaximumProductOfTwoElementsInAnArray();
        final int output = solution.maxProduct(new int[]{1, 5, 4, 5});

        Assert.assertEquals(16, output);
    }

    @Test
    public void test3() {
        final MaximumProductOfTwoElementsInAnArray solution = new MaximumProductOfTwoElementsInAnArray();
        final int output = solution.maxProduct(new int[]{3, 7});

        Assert.assertEquals(12, output);
    }

    @Test
    public void test4() {
        final MaximumProductOfTwoElementsInAnArray solution = new MaximumProductOfTwoElementsInAnArray();
        final int output = solution.maxProduct(new int[]{10, 2, 5, 2});

        Assert.assertEquals(36, output);
    }

}
