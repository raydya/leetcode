package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class TaskSchedulerTest {
    @Test
    public void test1() {
        final TaskScheduler solution = new TaskScheduler();
        final int output = solution.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2);

        Assert.assertEquals(8, output);
    }

    @Test
    public void test2() {
        final TaskScheduler solution = new TaskScheduler();
        final int output = solution.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 0);

        Assert.assertEquals(6, output);
    }

    @Test
    public void test3() {
        final TaskScheduler solution = new TaskScheduler();
        final int output = solution.leastInterval(new char[]{'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'}, 2);

        Assert.assertEquals(16, output);
    }
}
