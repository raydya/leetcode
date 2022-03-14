package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class JuQingChuFaShiJianTest {

    @Test
    public void test1() {
        final int[][] increase = {
            {2, 8, 4}, {2, 5, 0}, {10, 9, 8},
        };

        final int[][] requirements = {
            {2, 11, 3}, {15, 10, 7}, {9, 17, 12}, {8, 1, 14}
        };

        final JuQingChuFaShiJian solution = new JuQingChuFaShiJian();
        final int[] output = solution.getTriggerTime(increase, requirements);

        Assert.assertArrayEquals(new int[]{2, -1, 3, -1}, output);
    }

    @Test
    public void test2() {
        final int[][] increase = {
            {0, 4, 5}, {4, 8, 8}, {8, 6, 1}, {10, 10, 0}
        };

        final int[][] requirements = {
            {12, 11, 16}, {20, 2, 6}, {9, 2, 6}, {10, 18, 3}, {8, 14, 9}
        };

        final JuQingChuFaShiJian solution = new JuQingChuFaShiJian();
        final int[] output = solution.getTriggerTime(increase, requirements);

        Assert.assertArrayEquals(new int[]{-1, 4, 3, 3, 3}, output);
    }

    @Test
    public void test3() {
        final int[][] increase = {
            {1, 1, 1}
        };

        final int[][] requirements = {
            {0, 0, 0}
        };

        final JuQingChuFaShiJian solution = new JuQingChuFaShiJian();
        final int[] output = solution.getTriggerTime(increase, requirements);

        Assert.assertArrayEquals(new int[]{0}, output);
    }
}
