package com.raydya.hackerrank;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ClimbingTheLeaderBoardTest {

    @Test
    public void test1() {
        final ClimbingTheLeaderBoard solution = new ClimbingTheLeaderBoard();
        final List<Integer> output = solution.climbingLeaderBoard(
            Arrays.asList(100, 100, 50, 40, 40, 20, 10),
            Arrays.asList(5, 25, 50, 120)
        );

        Assert.assertArrayEquals(
            new Integer[]{6, 4, 2, 1},
            output.toArray()
        );
    }

}
