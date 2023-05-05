package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class TheEmployeeThatWorkedOnTheLongestTaskTest {

    @Test
    public void test1() {
        final TheEmployeeThatWorkedOnTheLongestTask solution = new TheEmployeeThatWorkedOnTheLongestTask();
        final int output = solution.hardestWorker(
            10,
            new int[][]{
                {0, 3},
                {2, 5},
                {0, 9},
                {1, 15}
            }
        );

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final TheEmployeeThatWorkedOnTheLongestTask solution = new TheEmployeeThatWorkedOnTheLongestTask();
        final int output = solution.hardestWorker(
            26,
            new int[][]{
                {1, 1},
                {3, 7},
                {2, 12},
                {7, 17}
            }
        );

        Assert.assertEquals(3, output);
    }

    @Test
    public void test3() {
        final TheEmployeeThatWorkedOnTheLongestTask solution = new TheEmployeeThatWorkedOnTheLongestTask();
        final int output = solution.hardestWorker(
            2,
            new int[][]{
                {0, 10},
                {1, 20}
            }
        );

        Assert.assertEquals(0, output);
    }
}
