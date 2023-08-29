package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreesWithFactorsTest {

    @Test
    public void test1() {
        final BinaryTreesWithFactors solution = new BinaryTreesWithFactors();
        final int output = solution.numFactoredBinaryTrees(new int[]{2, 4});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final BinaryTreesWithFactors solution = new BinaryTreesWithFactors();
        final int output = solution.numFactoredBinaryTrees(new int[]{2, 4, 5, 10});

        Assert.assertEquals(7, output);
    }
}
