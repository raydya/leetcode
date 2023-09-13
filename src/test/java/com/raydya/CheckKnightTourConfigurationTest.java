package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CheckKnightTourConfigurationTest {

    @Test
    public void test1() {
        final CheckKnightTourConfiguration solution = new CheckKnightTourConfiguration();
        final boolean output = solution.checkValidGrid(
            new int[][]{
                {0, 11, 16, 5, 20},
                {17, 4, 19, 10, 15},
                {12, 1, 8, 21, 6},
                {3, 18, 23, 14, 9},
                {24, 13, 2, 7, 22}
            }
        );

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final CheckKnightTourConfiguration solution = new CheckKnightTourConfiguration();
        final boolean output = solution.checkValidGrid(
            new int[][]{
                {0, 3, 6},
                {5, 8, 1},
                {2, 7, 4}
            }
        );

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final CheckKnightTourConfiguration solution = new CheckKnightTourConfiguration();
        final boolean output = solution.checkValidGrid(
            new int[][]{
                {24, 11, 22, 17, 4},
                {21, 16, 5, 12, 9},
                {6, 23, 10, 3, 18},
                {15, 20, 1, 8, 13},
                {0, 7, 14, 19, 2}
            }
        );

        Assert.assertFalse(output);
    }
}
