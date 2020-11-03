package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class PowerOfThreeTest {
    @Test
    public void test1() {
        final PowerOfThree solution = new PowerOfThree();
        final boolean powerOfThree = solution.isPowerOfThree(27);

        Assert.assertTrue(powerOfThree);
    }

    @Test
    public void test2() {
        final PowerOfThree solution = new PowerOfThree();
        final boolean powerOfThree = solution.isPowerOfThree(0);

        Assert.assertFalse(powerOfThree);
    }

    @Test
    public void test3() {
        final PowerOfThree solution = new PowerOfThree();
        final boolean powerOfThree = solution.isPowerOfThree(9);

        Assert.assertTrue(powerOfThree);
    }

    @Test
    public void test4() {
        final PowerOfThree solution = new PowerOfThree();
        final boolean powerOfThree = solution.isPowerOfThree(45);

        Assert.assertFalse(powerOfThree);
    }
}
