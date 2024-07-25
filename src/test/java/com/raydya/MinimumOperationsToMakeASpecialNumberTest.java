package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumOperationsToMakeASpecialNumberTest {

    @Test
    public void test1() {
        final MinimumOperationsToMakeASpecialNumber solution = new MinimumOperationsToMakeASpecialNumber();
        final int output = solution.minimumOperations("2245047");

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final MinimumOperationsToMakeASpecialNumber solution = new MinimumOperationsToMakeASpecialNumber();
        final int output = solution.minimumOperations("2908305");

        Assert.assertEquals(3, output);
    }

    @Test
    public void test3() {
        final MinimumOperationsToMakeASpecialNumber solution = new MinimumOperationsToMakeASpecialNumber();
        final int output = solution.minimumOperations("10");

        Assert.assertEquals(1, output);
    }
}
