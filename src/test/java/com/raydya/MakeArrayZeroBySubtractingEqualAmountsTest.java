package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MakeArrayZeroBySubtractingEqualAmountsTest {

    @Test
    public void test1() {
        final MakeArrayZeroBySubtractingEqualAmounts solution = new MakeArrayZeroBySubtractingEqualAmounts();
        final int output = solution.minimumOperations(new int[]{1, 5, 0, 3, 5});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final MakeArrayZeroBySubtractingEqualAmounts solution = new MakeArrayZeroBySubtractingEqualAmounts();
        final int output = solution.minimumOperations(new int[]{0});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final MakeArrayZeroBySubtractingEqualAmounts solution = new MakeArrayZeroBySubtractingEqualAmounts();
        final int output = solution.minimumOperations(new int[]{0, 0, 0, 0});

        Assert.assertEquals(0, output);
    }

}
