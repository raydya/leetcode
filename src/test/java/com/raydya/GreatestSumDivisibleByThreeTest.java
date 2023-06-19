package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class GreatestSumDivisibleByThreeTest {

    @Test
    public void test1() {
        final GreatestSumDivisibleByThree solution = new GreatestSumDivisibleByThree();
        final int output = solution.maxSumDivThree(new int[]{3, 6, 5, 1, 8});

        Assert.assertEquals(18, output);
    }

    @Test
    public void test2() {
        final GreatestSumDivisibleByThree solution = new GreatestSumDivisibleByThree();
        final int output = solution.maxSumDivThree(new int[]{4});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final GreatestSumDivisibleByThree solution = new GreatestSumDivisibleByThree();
        final int output = solution.maxSumDivThree(new int[]{1, 2, 3, 4, 4});

        Assert.assertEquals(12, output);
    }
}
