package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountOperationsToObtainZeroTest {

    @Test
    public void test1() {
        final CountOperationsToObtainZero solution = new CountOperationsToObtainZero();
        final int output = solution.countOperations(2, 3);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final CountOperationsToObtainZero solution = new CountOperationsToObtainZero();
        final int output = solution.countOperations(10, 10);

        Assert.assertEquals(1, output);
    }
}
