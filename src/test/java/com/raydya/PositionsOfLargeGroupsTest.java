package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PositionsOfLargeGroupsTest {
    @Test
    public void test1() {
        final PositionsOfLargeGroups solution = new PositionsOfLargeGroups();
        final List<List<Integer>> output = solution.largeGroupPositions("abbxxxxzzy");

        Assert.assertArrayEquals(new Integer[]{3, 6}, output.get(0).toArray());
    }

    @Test
    public void test2() {
        final PositionsOfLargeGroups solution = new PositionsOfLargeGroups();
        final List<List<Integer>> output = solution.largeGroupPositions("abc");

        Assert.assertArrayEquals(new Integer[]{}, output.toArray());
    }

    @Test
    public void test3() {
        final PositionsOfLargeGroups solution = new PositionsOfLargeGroups();
        final List<List<Integer>> output = solution.largeGroupPositions("abcdddeeeeaabbbcd");

        Assert.assertArrayEquals(new Integer[]{3, 5}, output.get(0).toArray());
        Assert.assertArrayEquals(new Integer[]{6, 9}, output.get(1).toArray());
        Assert.assertArrayEquals(new Integer[]{12, 14}, output.get(2).toArray());
    }

    @Test
    public void test4() {
        final PositionsOfLargeGroups solution = new PositionsOfLargeGroups();
        final List<List<Integer>> output = solution.largeGroupPositions("aba");

        Assert.assertArrayEquals(new Integer[]{}, output.toArray());
    }

    @Test
    public void test5() {
        final PositionsOfLargeGroups solution = new PositionsOfLargeGroups();
        final List<List<Integer>> output = solution.largeGroupPositions("aaa");

        Assert.assertArrayEquals(new Integer[]{0, 2}, output.get(0).toArray());
    }
}
