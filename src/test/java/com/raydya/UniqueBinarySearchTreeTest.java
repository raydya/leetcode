package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class UniqueBinarySearchTreeTest {
    @Test
    public void test1() {
        final UniqueBinarySearchTrees solution = new UniqueBinarySearchTrees();
        final int numTrees = solution.numTrees(3);

        Assert.assertEquals(5, numTrees);
    }
}
