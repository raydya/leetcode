package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ToeplitzMatrixTest {
    @Test
    public void test1() {
        final ToeplitzMatrix solution = new ToeplitzMatrix();
        final boolean output = solution.isToeplitzMatrix(new int[][]{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}});

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final ToeplitzMatrix solution = new ToeplitzMatrix();
        final boolean output = solution.isToeplitzMatrix(new int[][]{{1, 2}, {2, 2}});

        Assert.assertFalse(output);
    }
}
