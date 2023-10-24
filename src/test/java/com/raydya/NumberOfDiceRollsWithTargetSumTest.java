package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfDiceRollsWithTargetSumTest {

    @Test
    public void test1() {
        final NumberOfDiceRollsWithTargetSum solution = new NumberOfDiceRollsWithTargetSum();
        final int output = solution.numRollsToTarget(1, 6, 3);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final NumberOfDiceRollsWithTargetSum solution = new NumberOfDiceRollsWithTargetSum();
        final int output = solution.numRollsToTarget(2, 6, 7);

        Assert.assertEquals(6, output);
    }

    @Test
    public void test3() {
        final NumberOfDiceRollsWithTargetSum solution = new NumberOfDiceRollsWithTargetSum();
        final int output = solution.numRollsToTarget(30, 30, 500);

        Assert.assertEquals(222616187, output);
    }
}
