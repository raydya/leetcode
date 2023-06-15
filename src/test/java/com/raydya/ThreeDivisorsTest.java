package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ThreeDivisorsTest {

    @Test
    public void test1() {
        final ThreeDivisors solution = new ThreeDivisors();
        final boolean output = solution.isThree(2);

        Assert.assertFalse(output);
    }

    @Test
    public void test2() {
        final ThreeDivisors solution = new ThreeDivisors();
        final boolean output = solution.isThree(4);

        Assert.assertTrue(output);
    }
}
