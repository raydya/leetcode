package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CourseScheduleIITest {

    @Test
    public void test1() {
        final CourseScheduleII solution = new CourseScheduleII();
        final int[] output = solution.findOrder(2, new int[][]{{1, 0}});

        Assert.assertArrayEquals(new int[]{0, 1}, output);
    }

    @Test
    public void test2() {
        final CourseScheduleII solution = new CourseScheduleII();
        final int[] output = solution.findOrder(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}});

        Assert.assertArrayEquals(new int[]{0, 1, 2, 3}, output);
    }
}
