package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ClimbingStairsTest {

    @Test
    public void test1() {
        final int input = 2;

        final ClimbingStairs climbingStairs = new ClimbingStairs();
        final int output = climbingStairs.climbStairs(input);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final int input = 3;

        final ClimbingStairs climbingStairs = new ClimbingStairs();
        final int output = climbingStairs.climbStairs(input);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test3() {
        final int input = 4;

        final ClimbingStairs climbingStairs = new ClimbingStairs();
        final int output = climbingStairs.climbStairs(input);

        Assert.assertEquals(5, output);
    }
}
