package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfGoodPairsTest {

    @Test
    public void test1() {
        final NumberOfGoodPairs solution = new NumberOfGoodPairs();
        final int output = solution.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3});

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final NumberOfGoodPairs solution = new NumberOfGoodPairs();
        final int output = solution.numIdenticalPairs(new int[]{1, 1, 1, 1});

        Assert.assertEquals(6, output);
    }

    @Test
    public void test3() {
        final NumberOfGoodPairs solution = new NumberOfGoodPairs();
        final int output = solution.numIdenticalPairs(new int[]{1, 2, 3});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test4() {
        final NumberOfGoodPairs solution = new NumberOfGoodPairs();
        final int output = solution.numIdenticalPairs(
            new int[]{6, 5, 1, 5, 7, 7, 9, 1, 5, 7, 1, 6, 10, 9, 7, 4, 1, 8, 7, 1, 1, 8, 6, 4, 7, 4, 10, 5, 3, 9, 10, 1,
                9, 5, 5, 4, 1, 7, 4, 2, 9, 2, 6, 6, 4, 2, 10, 3, 5, 3, 6, 4, 7, 4, 6, 4, 4, 6, 3, 4, 10, 1, 10, 6, 10,
                4, 9, 6, 6, 4, 8, 6, 9, 5, 4});

        Assert.assertEquals(303, output);
    }

    @Test
    public void test5() {
        final NumberOfGoodPairs solution = new NumberOfGoodPairs();
        final int output = solution.numIdenticalPairs(
            new int[]{2, 2, 1, 5, 1, 5, 5, 2, 3, 1, 1, 5, 3, 2, 3, 3, 3, 1, 3, 3, 4, 3, 1, 3, 1, 4, 5, 5, 2, 2, 1, 3, 5,
                2, 2, 4, 3, 2, 5, 3, 1, 1, 3, 3, 2, 5, 2, 1, 2, 4, 3, 4, 4, 3, 2, 4, 4, 1, 3, 3, 3, 5, 5, 5, 4, 1, 1, 2,
                3, 3, 2, 5, 3, 4, 5, 3, 1, 2, 5, 4, 5, 2, 3, 3, 1, 5, 2, 4, 2, 4, 4, 3, 1, 3});

        Assert.assertEquals(885, output);
    }

}
