package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class WalkingRobotSimulationTest {

    @Test
    public void test1() {
        final WalkingRobotSimulation solution = new WalkingRobotSimulation();
        final int output = solution.robotSim(new int[]{4, -1, 3}, new int[][]{});

        Assert.assertEquals(25, output);
    }

    @Test
    public void test2() {
        final WalkingRobotSimulation solution = new WalkingRobotSimulation();
        final int output = solution.robotSim(new int[]{4, -1, 4, -2, 4}, new int[][]{{2, 4}});

        Assert.assertEquals(65, output);
    }

    @Test
    public void test3() {
        final WalkingRobotSimulation solution = new WalkingRobotSimulation();
        final int output = solution.robotSim(new int[]{6, -1, -1, 6}, new int[][]{});

        Assert.assertEquals(36, output);
    }

    @Test
    public void test4() {
        final WalkingRobotSimulation solution = new WalkingRobotSimulation();
        final int output = solution.robotSim(
            new int[]{7, -2, -2, 7, 5},
            new int[][]{
                {-3, 2}, {-2, 1}, {0, 1}, {-2, 4}, {-1, 0}, {-2, -3}, {0, -3}, {4, 4}, {-3, 3}, {2, 2}
            }
        );

        Assert.assertEquals(4, output);
    }
}
