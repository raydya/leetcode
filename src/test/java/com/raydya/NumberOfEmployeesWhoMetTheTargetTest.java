package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfEmployeesWhoMetTheTargetTest {

    @Test
    public void test1() {
        final NumberOfEmployeesWhoMetTheTarget solution = new NumberOfEmployeesWhoMetTheTarget();
        final int output = solution.numberOfEmployeesWhoMetTarget(new int[]{0, 1, 2, 3, 4}, 2);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final NumberOfEmployeesWhoMetTheTarget solution = new NumberOfEmployeesWhoMetTheTarget();
        final int output = solution.numberOfEmployeesWhoMetTarget(new int[]{5, 1, 4, 2, 2}, 6);

        Assert.assertEquals(0, output);
    }
}
