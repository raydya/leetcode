package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCutsTest {

    @Test
    public void test1() {
        final MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts solution = new MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts();
        final int output = solution.maxArea(5, 4, new int[]{1, 2, 4}, new int[]{1, 3});

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts solution = new MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts();
        final int output = solution.maxArea(5, 4, new int[]{3, 1}, new int[]{1});

        Assert.assertEquals(6, output);
    }

    @Test
    public void test3() {
        final MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts solution = new MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts();
        final int output = solution.maxArea(1000000000, 1000000000, new int[]{2}, new int[]{2});

        Assert.assertEquals(81, output);
    }
}
