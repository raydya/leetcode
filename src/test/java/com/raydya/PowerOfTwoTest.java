package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class PowerOfTwoTest {
    @Test
    public void test1() {
        final PowerOfTwo solution = new PowerOfTwo();
        final boolean powerOfTwo = solution.isPowerOfTwo(1);

        Assert.assertTrue(powerOfTwo);
    }

    @Test
    public void test2() {
        final PowerOfTwo solution = new PowerOfTwo();
        final boolean powerOfTwo = solution.isPowerOfTwo(16);

        Assert.assertTrue(powerOfTwo);
    }

    @Test
    public void test3() {
        final PowerOfTwo solution = new PowerOfTwo();
        final boolean powerOfTwo = solution.isPowerOfTwo(3);

        Assert.assertFalse(powerOfTwo);
    }

    @Test
    public void test4() {
        final PowerOfTwo solution = new PowerOfTwo();
        final boolean powerOfTwo = solution.isPowerOfTwo(4);

        Assert.assertTrue(powerOfTwo);
    }

    @Test
    public void test5() {
        final PowerOfTwo solution = new PowerOfTwo();
        final boolean powerOfTwo = solution.isPowerOfTwo(5);

        Assert.assertFalse(powerOfTwo);
    }

    @Test
    public void test6() {
        final PowerOfTwo solution = new PowerOfTwo();
        final boolean powerOfTwo = solution.isPowerOfTwo(-2147483648);

        Assert.assertFalse(powerOfTwo);
    }
}
