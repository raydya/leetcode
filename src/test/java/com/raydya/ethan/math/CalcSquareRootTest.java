package com.raydya.ethan.math;

import org.junit.Assert;
import org.junit.Test;

public class CalcSquareRootTest {

    /**
     * √2 = 1.41421356237
     */
    @Test
    public void test1() {
        final CalcSquareRoot solution = new CalcSquareRoot();
        final double output = solution.calc(2, 0.001);

        Assert.assertEquals(1.414, output, 0.001);
    }


    @Test
    public void test2() {
        final CalcSquareRoot solution = new CalcSquareRoot();
        final double output = solution.calc(2, 0.00001);

        Assert.assertEquals(1.41421, output, 0.00001);
    }

    /**
     * √10 = 3.16227766017
     */
    @Test
    public void test3() {
        final CalcSquareRoot solution = new CalcSquareRoot();
        final double output = solution.calc(10, 0.00000001);

        Assert.assertEquals(3.16227766, output, 0.00000001);
    }

    @Test
    public void test4() {
        final CalcSquareRoot solution = new CalcSquareRoot();
        final double output = solution.calc(10, 0.00000000001);

        Assert.assertEquals(3.16227766017, output, 0.00000000001);
    }

}
