package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SpecialPositionsInABinaryMatrixTest {

    @Test
    public void test1() {
        final SpecialPositionsInABinaryMatrix solution = new SpecialPositionsInABinaryMatrix();
        final int output = solution.numSpecial(new int[][]{
            {1, 0, 0},
            {0, 0, 1},
            {1, 0, 0}
        });

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final SpecialPositionsInABinaryMatrix solution = new SpecialPositionsInABinaryMatrix();
        final int output = solution.numSpecial(new int[][]{
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        });

        Assert.assertEquals(3, output);
    }

    @Test
    public void test3() {
        final SpecialPositionsInABinaryMatrix solution = new SpecialPositionsInABinaryMatrix();
        final int output = solution.numSpecial(new int[][]{
            {0, 0, 0, 1},
            {1, 0, 0, 0},
            {0, 1, 1, 0},
            {0, 0, 0, 0}
        });

        Assert.assertEquals(2, output);
    }

    @Test
    public void test4() {
        final SpecialPositionsInABinaryMatrix solution = new SpecialPositionsInABinaryMatrix();
        final int output = solution.numSpecial(new int[][]{
            {0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 0, 1, 1},
        });

        Assert.assertEquals(3, output);
    }

}
