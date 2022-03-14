package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfItIsAStraightLineTest {

    @Test
    public void test1() {
        final int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};

        final CheckIfItIsAStraightLine solution = new CheckIfItIsAStraightLine();
        final boolean output = solution.checkStraightLine(coordinates);

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final int[][] coordinates = {{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};

        final CheckIfItIsAStraightLine solution = new CheckIfItIsAStraightLine();
        final boolean output = solution.checkStraightLine(coordinates);

        Assert.assertFalse(output);
    }
}
