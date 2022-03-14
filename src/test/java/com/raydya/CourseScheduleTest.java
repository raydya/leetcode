package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CourseScheduleTest {

    @Test
    public void test1() {
        final CourseSchedule solution = new CourseSchedule();
        final boolean canFinish = solution.canFinish(2, new int[][]{{1, 0}});
        Assert.assertTrue(canFinish);
    }

    @Test
    public void test2() {
        final CourseSchedule solution = new CourseSchedule();
        final boolean canFinish = solution.canFinish(2, new int[][]{{1, 0}, {0, 1}});
        Assert.assertFalse(canFinish);
    }

    @Test
    public void test3() {
        final int[][] prerequisites = {{0, 10}, {3, 18}, {5, 5}, {6, 11}, {11, 14}, {13, 1},
            {15, 1}, {17, 4}};

        final CourseSchedule solution = new CourseSchedule();
        final boolean canFinish = solution.canFinish(20, prerequisites);
        Assert.assertFalse(canFinish);
    }

    @Test
    public void test4() {
        final CourseSchedule solution = new CourseSchedule();
        final boolean canFinish = solution.canFinish(3, new int[][]{{1, 0}, {1, 2}, {0, 1}});
        Assert.assertFalse(canFinish);
    }

    @Test
    public void test5() {
        final CourseSchedule solution = new CourseSchedule();
        final boolean canFinish = solution.canFinish(5,
            new int[][]{{1, 4}, {2, 4}, {3, 1}, {3, 2}});
        Assert.assertTrue(canFinish);
    }
}
