package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CellsWithOddValuesInAMatrixTest {
    @Test
    public void test1() {
        final CellsWithOddValuesInAMatrix solution = new CellsWithOddValuesInAMatrix();
        final int output = solution.oddCells(2, 3, new int[][]{{0, 1}, {1, 1}});

        Assert.assertEquals(6, output);
    }

    @Test
    public void test2() {
        final CellsWithOddValuesInAMatrix solution = new CellsWithOddValuesInAMatrix();
        final int output = solution.oddCells(2, 2, new int[][]{{1, 1}, {0, 0}});

        Assert.assertEquals(0, output);
    }
}
