package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class PowerOfFourTest {

    @Test
    public void test1() {
        final PowerOfFour solution = new PowerOfFour();
        final boolean powerOfFour = solution.isPowerOfFour(16);

        Assert.assertTrue(powerOfFour);
    }

    @Test
    public void test2() {
        final PowerOfFour solution = new PowerOfFour();
        final boolean powerOfFour = solution.isPowerOfFour(5);

        Assert.assertFalse(powerOfFour);
    }
}
