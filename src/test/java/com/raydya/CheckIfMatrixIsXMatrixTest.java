package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfMatrixIsXMatrixTest {

    @Test
    public void test1() {
        final CheckIfMatrixIsXMatrix solution = new CheckIfMatrixIsXMatrix();
        final boolean output = solution.checkXMatrix(
            new int[][]{{2, 0, 0, 1}, {0, 3, 1, 0}, {0, 5, 2, 0}, {4, 0, 0, 2}});

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final CheckIfMatrixIsXMatrix solution = new CheckIfMatrixIsXMatrix();
        final boolean output = solution.checkXMatrix(
            new int[][]{{5, 7, 0}, {0, 3, 1}, {0, 5, 0}});

        Assert.assertFalse(output);
    }

}
