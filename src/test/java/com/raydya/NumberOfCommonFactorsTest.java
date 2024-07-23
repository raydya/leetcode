package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfCommonFactorsTest {

    @Test
    public void test1() {
        final NumberOfCommonFactors solution = new NumberOfCommonFactors();
        final int output = solution.commonFactors(12, 6);

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final NumberOfCommonFactors solution = new NumberOfCommonFactors();
        final int output = solution.commonFactors(25, 30);

        Assert.assertEquals(2, output);
    }
}
