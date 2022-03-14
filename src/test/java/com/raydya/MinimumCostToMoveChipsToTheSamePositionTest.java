package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumCostToMoveChipsToTheSamePositionTest {

    @Test
    public void test1() {
        final MinimumCostToMoveChipsToTheSamePosition solution = new MinimumCostToMoveChipsToTheSamePosition();
        final int output = solution.minCostToMoveChips(new int[]{1, 2, 3});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final MinimumCostToMoveChipsToTheSamePosition solution = new MinimumCostToMoveChipsToTheSamePosition();
        final int output = solution.minCostToMoveChips(new int[]{2, 2, 2, 3, 3});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final MinimumCostToMoveChipsToTheSamePosition solution = new MinimumCostToMoveChipsToTheSamePosition();
        final int output = solution.minCostToMoveChips(new int[]{2, 2, 2, 3});

        Assert.assertEquals(1, output);
    }
}
