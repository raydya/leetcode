package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MovementOfRobotsTest {

    @Test
    public void test1() {
        final MovementOfRobots solution = new MovementOfRobots();
        final int output = solution.sumDistance(new int[]{-2, 0, 2}, "RLL", 3);

        Assert.assertEquals(8, output);
    }

    @Test
    public void test2() {
        final MovementOfRobots solution = new MovementOfRobots();
        final int output = solution.sumDistance(new int[]{1, 0}, "RL", 2);

        Assert.assertEquals(5, output);
    }

    @Test
    public void test3() {
        final MovementOfRobots solution = new MovementOfRobots();
        final int output = solution.sumDistance(new int[]{-10, -13, 10, 14, 11}, "LRLLR", 2);

        Assert.assertEquals(146, output);
    }
}
