package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberOfOperationsWithTheSameScoreTest {

    @Test
    public void test1() {
        final MaximumNumberOfOperationsWithTheSameScore solution = new MaximumNumberOfOperationsWithTheSameScore();
        final int output = solution.maxOperations(new int[]{3, 2, 1, 4, 5});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final MaximumNumberOfOperationsWithTheSameScore solution = new MaximumNumberOfOperationsWithTheSameScore();
        final int output = solution.maxOperations(new int[]{3, 2, 6, 1, 4});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test3() {
        final MaximumNumberOfOperationsWithTheSameScore solution = new MaximumNumberOfOperationsWithTheSameScore();
        final int output = solution.maxOperations(new int[]{3, 2, 1, 4, 1});

        Assert.assertEquals(2, output);
    }
}
