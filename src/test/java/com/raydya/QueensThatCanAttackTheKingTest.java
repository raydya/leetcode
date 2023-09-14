package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class QueensThatCanAttackTheKingTest {

    @Test
    public void test1() {
        final QueensThatCanAttackTheKing solution = new QueensThatCanAttackTheKing();
        final List<List<Integer>> output = solution.queensAttacktheKing(
            new int[][]{{0, 1}, {1, 0}, {4, 0}, {0, 4}, {3, 3}, {2, 4}}, new int[]{0, 0});

        Assert.assertArrayEquals(new Integer[]{0, 1}, output.get(0).toArray());
        Assert.assertArrayEquals(new Integer[]{1, 0}, output.get(1).toArray());
        Assert.assertArrayEquals(new Integer[]{3, 3}, output.get(2).toArray());
    }

    @Test
    public void test2() {
        final QueensThatCanAttackTheKing solution = new QueensThatCanAttackTheKing();
        final List<List<Integer>> output = solution.queensAttacktheKing(
            new int[][]{{0, 0}, {1, 1}, {2, 2}, {3, 4}, {3, 5}, {4, 4}, {4, 5}}, new int[]{3, 3});

        Assert.assertArrayEquals(new Integer[]{3, 4}, output.get(0).toArray());
        Assert.assertArrayEquals(new Integer[]{2, 2}, output.get(1).toArray());
        Assert.assertArrayEquals(new Integer[]{4, 4}, output.get(2).toArray());
    }

    @Test
    public void test3() {
        final QueensThatCanAttackTheKing solution = new QueensThatCanAttackTheKing();
        final List<List<Integer>> output = solution.queensAttacktheKing(
            new int[][]{{5, 6}, {7, 7}, {2, 1}, {0, 7}, {1, 6}, {5, 1}, {3, 7}, {0, 3}, {4, 0}, {1, 2}, {6, 3}, {5, 0},
                {0, 4}, {2, 2}, {1, 1}, {6, 4}, {5, 4}, {0, 0}, {2, 6}, {4, 5}, {5, 2}, {1, 4}, {7, 5}, {2, 3}, {0, 5},
                {4, 2}, {1, 0}, {2, 7}, {0, 1}, {4, 6}, {6, 1}, {0, 6}, {4, 3}, {1, 7}},
            new int[]{3, 4});

        Assert.assertArrayEquals(new Integer[]{3, 7}, output.get(0).toArray());
        Assert.assertArrayEquals(new Integer[]{1, 4}, output.get(1).toArray());
        Assert.assertArrayEquals(new Integer[]{5, 4}, output.get(2).toArray());
        Assert.assertArrayEquals(new Integer[]{2, 3}, output.get(3).toArray());
        Assert.assertArrayEquals(new Integer[]{4, 3}, output.get(4).toArray());
        Assert.assertArrayEquals(new Integer[]{1, 6}, output.get(5).toArray());
        Assert.assertArrayEquals(new Integer[]{4, 5}, output.get(6).toArray());
    }

}
