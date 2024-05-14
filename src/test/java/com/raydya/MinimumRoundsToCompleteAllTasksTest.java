package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumRoundsToCompleteAllTasksTest {

    @Test
    public void test1() {
        final MinimumRoundsToCompleteAllTasks solution = new MinimumRoundsToCompleteAllTasks();
        final int output = solution.minimumRounds(new int[]{2, 2, 3, 3, 2, 4, 4, 4, 4, 4});

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final MinimumRoundsToCompleteAllTasks solution = new MinimumRoundsToCompleteAllTasks();
        final int output = solution.minimumRounds(new int[]{2, 3, 3});

        Assert.assertEquals(-1, output);
    }
}
