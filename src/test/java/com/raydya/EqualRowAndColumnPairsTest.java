package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class EqualRowAndColumnPairsTest {

    @Test
    public void test1() {
        final EqualRowAndColumnPairs solution = new EqualRowAndColumnPairs();
        final int output = solution.equalPairs(new int[][]{
            {3, 2, 1},
            {1, 7, 6},
            {2, 7, 7}
        });

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final EqualRowAndColumnPairs solution = new EqualRowAndColumnPairs();
        final int output = solution.equalPairs(new int[][]{
            {3, 1, 2, 2},
            {1, 4, 4, 5},
            {2, 4, 2, 2},
            {2, 4, 2, 2}
        });

        Assert.assertEquals(3, output);
    }
}
