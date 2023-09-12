package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CourseScheduleIVTest {

    @Test
    public void test1() {
        final CourseScheduleIV solution = new CourseScheduleIV();
        final List<Boolean> output = solution.checkIfPrerequisite(2, new int[][]{{1, 0}},
            new int[][]{{0, 1}, {1, 0}});

        Assert.assertArrayEquals(new Boolean[]{false, true}, output.toArray());
    }

    @Test
    public void test2() {
        final CourseScheduleIV solution = new CourseScheduleIV();
        final List<Boolean> output = solution.checkIfPrerequisite(2, new int[][]{},
            new int[][]{{1, 0}, {0, 1}});

        Assert.assertArrayEquals(new Boolean[]{false, false}, output.toArray());
    }

    @Test
    public void test3() {
        final CourseScheduleIV solution = new CourseScheduleIV();
        final List<Boolean> output = solution.checkIfPrerequisite(3, new int[][]{{1, 2}, {1, 0}, {2, 0}},
            new int[][]{{1, 0}, {1, 2}});

        Assert.assertArrayEquals(new Boolean[]{true, true}, output.toArray());
    }
}
