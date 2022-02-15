package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LuckyNumbersInAMatrixTest {
    @Test
    public void test1() {
        final LuckyNumbersInAMatrix solution = new LuckyNumbersInAMatrix();
        final List<Integer> output = solution.luckyNumbers(new int[][]{
            {3, 7, 8}, {9, 11, 13}, {15, 16, 17}
        });

        Assert.assertArrayEquals(new Integer[]{15}, output.toArray());
    }

    @Test
    public void test2() {
        final LuckyNumbersInAMatrix solution = new LuckyNumbersInAMatrix();
        final List<Integer> output = solution.luckyNumbers(new int[][]{
            {1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}
        });

        Assert.assertArrayEquals(new Integer[]{12}, output.toArray());
    }

    @Test
    public void test3() {
        final LuckyNumbersInAMatrix solution = new LuckyNumbersInAMatrix();
        final List<Integer> output = solution.luckyNumbers(new int[][]{
            {7, 8}, {1, 2}
        });

        Assert.assertArrayEquals(new Integer[]{7}, output.toArray());
    }
}
