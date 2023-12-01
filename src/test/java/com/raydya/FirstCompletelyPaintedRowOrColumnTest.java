package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FirstCompletelyPaintedRowOrColumnTest {

    @Test
    public void test1() {
        final FirstCompletelyPaintedRowOrColumn solution = new FirstCompletelyPaintedRowOrColumn();
        final int output = solution.firstCompleteIndex(
            new int[]{1, 3, 4, 2},
            new int[][]{
                {1, 4},
                {2, 3}
            }
        );

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final FirstCompletelyPaintedRowOrColumn solution = new FirstCompletelyPaintedRowOrColumn();
        final int output = solution.firstCompleteIndex(
            new int[]{2, 8, 7, 4, 1, 3, 5, 6, 9},
            new int[][]{
                {3, 2, 5},
                {1, 4, 6},
                {8, 7, 9}
            }
        );

        Assert.assertEquals(3, output);
    }

}
