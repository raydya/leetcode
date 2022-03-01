package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CreateTargetArrayInTheGivenOrderTest {

    @Test
    public void test1() {
        final CreateTargetArrayInTheGivenOrder solution = new CreateTargetArrayInTheGivenOrder();
        final int[] output = solution.createTargetArray(new int[]{0, 1, 2, 3, 4},
            new int[]{0, 1, 2, 2, 1});

        Assert.assertArrayEquals(new int[]{0, 4, 1, 3, 2}, output);
    }

    @Test
    public void test2() {
        final CreateTargetArrayInTheGivenOrder solution = new CreateTargetArrayInTheGivenOrder();
        final int[] output = solution.createTargetArray(new int[]{1, 2, 3, 4, 0},
            new int[]{0, 1, 2, 3, 0});

        Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 4}, output);
    }

    @Test
    public void test3() {
        final CreateTargetArrayInTheGivenOrder solution = new CreateTargetArrayInTheGivenOrder();
        final int[] output = solution.createTargetArray(new int[]{1},
            new int[]{0});

        Assert.assertArrayEquals(new int[]{1}, output);
    }

}
