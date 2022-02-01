package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfStepsToReduceANumberToZeroTest {
    @Test
    public void test1() {
        final NumberOfStepsToReduceANumberToZero solution = new NumberOfStepsToReduceANumberToZero();
        final int output = solution.numberOfSteps(14);

        Assert.assertEquals(6, output);
    }

    @Test
    public void test2() {
        final NumberOfStepsToReduceANumberToZero solution = new NumberOfStepsToReduceANumberToZero();
        final int output = solution.numberOfSteps(8);

        Assert.assertEquals(4, output);
    }

    @Test
    public void test3() {
        final NumberOfStepsToReduceANumberToZero solution = new NumberOfStepsToReduceANumberToZero();
        final int output = solution.numberOfSteps(123);

        Assert.assertEquals(12, output);
    }
}
