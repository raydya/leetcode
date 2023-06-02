package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DetermineWhetherMatrixCanBeObtainedByRotationTest {

    @Test
    public void test1() {
        final DetermineWhetherMatrixCanBeObtainedByRotation solution = new DetermineWhetherMatrixCanBeObtainedByRotation();
        final boolean output = solution.findRotation(
            new int[][]{
                {0, 1},
                {1, 0}
            },
            new int[][]{
                {1, 0},
                {0, 1}
            }
        );

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final DetermineWhetherMatrixCanBeObtainedByRotation solution = new DetermineWhetherMatrixCanBeObtainedByRotation();
        final boolean output = solution.findRotation(
            new int[][]{
                {0, 1},
                {1, 1}
            },
            new int[][]{
                {1, 0},
                {0, 1}
            }
        );

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final DetermineWhetherMatrixCanBeObtainedByRotation solution = new DetermineWhetherMatrixCanBeObtainedByRotation();
        final boolean output = solution.findRotation(
            new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
            },
            new int[][]{
                {1, 1, 1},
                {0, 1, 0},
                {0, 0, 0}
            }
        );

        Assert.assertTrue(output);
    }
}
