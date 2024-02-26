package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumNumberOfOperationsToConvertTimeTest {

    @Test
    public void test1() {
        final MinimumNumberOfOperationsToConvertTime solution = new MinimumNumberOfOperationsToConvertTime();
        final int output = solution.convertTime("02:30", "04:35");

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final MinimumNumberOfOperationsToConvertTime solution = new MinimumNumberOfOperationsToConvertTime();
        final int output = solution.convertTime("11:00", "11:01");

        Assert.assertEquals(1, output);
    }
}
