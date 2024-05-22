package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FindPlayersWithZeroOrOneLossesTest {

    @Test
    public void test1() {
        final FindPlayersWithZeroOrOneLosses solution = new FindPlayersWithZeroOrOneLosses();
        final List<List<Integer>> output = solution.findWinners(new int[][]{
            {1, 3}, {2, 3}, {3, 6}, {5, 6},
            {5, 7}, {4, 5}, {4, 8}, {4, 9},
            {10, 4}, {10, 9}
        });

        Assert.assertArrayEquals(new Integer[]{1, 2, 10}, output.get(0).toArray());
        Assert.assertArrayEquals(new Integer[]{4, 5, 7, 8}, output.get(1).toArray());
    }

    @Test
    public void test2() {
        final FindPlayersWithZeroOrOneLosses solution = new FindPlayersWithZeroOrOneLosses();
        final List<List<Integer>> output = solution.findWinners(new int[][]{
            {2, 3}, {1, 3}, {5, 4}, {6, 4}
        });

        Assert.assertArrayEquals(new Integer[]{1, 2, 5, 6}, output.get(0).toArray());
        Assert.assertArrayEquals(new Integer[]{}, output.get(1).toArray());
    }
}
