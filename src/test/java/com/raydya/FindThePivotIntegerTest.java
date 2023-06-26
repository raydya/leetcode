package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindThePivotIntegerTest {

    @Test
    public void test1() {
        final FindThePivotInteger solution = new FindThePivotInteger();
        final int output = solution.pivotInteger(8);

        Assert.assertEquals(6, output);
    }

    @Test
    public void test2() {
        final FindThePivotInteger solution = new FindThePivotInteger();
        final int output = solution.pivotInteger(1);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test3() {
        final FindThePivotInteger solution = new FindThePivotInteger();
        final int output = solution.pivotInteger(4);

        Assert.assertEquals(-1, output);
    }
}
