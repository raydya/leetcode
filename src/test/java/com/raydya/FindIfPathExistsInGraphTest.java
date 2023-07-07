package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindIfPathExistsInGraphTest {

    @Test
    public void test1() {
        final FindIfPathExistsInGraph solution = new FindIfPathExistsInGraph();
        final boolean output = solution.validPath(
            3,
            new int[][]{
                {0, 1},
                {1, 2},
                {2, 0}
            },
            0,
            2
        );

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final FindIfPathExistsInGraph solution = new FindIfPathExistsInGraph();
        final boolean output = solution.validPath(
            6,
            new int[][]{
                {0, 1},
                {0, 2},
                {3, 5},
                {5, 4},
                {4, 3}
            },
            0,
            5
        );

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final FindIfPathExistsInGraph solution = new FindIfPathExistsInGraph();
        final boolean output = solution.validPath(
            5,
            new int[][]{
                {0, 4},
            },
            0,
            4
        );

        Assert.assertTrue(output);
    }

    @Test
    public void test4() {
        final FindIfPathExistsInGraph solution = new FindIfPathExistsInGraph();
        final boolean output = solution.validPath(
            10,
            new int[][]{
                {4, 3}, {1, 4}, {4, 8}, {1, 7}, {6, 4}, {4, 2}, {7, 4}, {4, 0}, {0, 9}, {5, 4}
            },
            5,
            9
        );

        Assert.assertTrue(output);
    }

    @Test
    public void test5() {
        final FindIfPathExistsInGraph solution = new FindIfPathExistsInGraph();
        final boolean output = solution.validPath(
            10,
            new int[][]{
                {0, 7}, {0, 8}, {6, 1}, {2, 0}, {0, 4}, {5, 8}, {4, 7}, {1, 3}, {3, 5}, {6, 5}
            },
            7,
            5
        );

        Assert.assertTrue(output);
    }

}
