package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximumRowsCoveredByColumnsTest {

    @Test
    public void test1() {
        final MaximumRowsCoveredByColumns solution = new MaximumRowsCoveredByColumns();
        final int output = solution.maximumRows(
            new int[][]{
                {0, 0, 0},
                {1, 0, 1},
                {0, 1, 1},
                {0, 0, 1}
            },
            2
        );

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final MaximumRowsCoveredByColumns solution = new MaximumRowsCoveredByColumns();
        final int output = solution.maximumRows(
            new int[][]{
                {0},
                {1},
            },
            1
        );

        Assert.assertEquals(2, output);
    }
}
