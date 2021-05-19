package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ProgrammableRobotTest {
    @Test
    public void test1() {
        final ProgrammableRobot solution = new ProgrammableRobot();
        final boolean output = solution.robot("URR", new int[][]{}, 3, 2);

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final ProgrammableRobot solution = new ProgrammableRobot();
        final boolean output = solution.robot("URR", new int[][]{{2, 2}}, 3, 2);

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final ProgrammableRobot solution = new ProgrammableRobot();
        final boolean output = solution.robot("URR", new int[][]{{4, 2}}, 3, 2);

        Assert.assertTrue(output);
    }

    @Test
    public void test4() {
        final int[][] obstacles = {{5, 5}, {9, 4}, {9, 7}, {6, 4}, {7, 0}, {9, 5}, {10, 7}, {1, 1}, {7, 5}};
        final ProgrammableRobot solution = new ProgrammableRobot();
        final boolean output = solution.robot("RRU", obstacles, 1486, 743);

        Assert.assertFalse(output);
    }
}
