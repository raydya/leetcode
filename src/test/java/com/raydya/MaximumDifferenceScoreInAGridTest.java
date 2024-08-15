package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MaximumDifferenceScoreInAGridTest {

    @Test
    public void test1() {
        final MaximumDifferenceScoreInAGrid solution = new MaximumDifferenceScoreInAGrid();

        final List<List<Integer>> input = Arrays.asList(
            Arrays.asList(9, 5, 7, 3),
            Arrays.asList(8, 9, 6, 1),
            Arrays.asList(6, 7, 14, 3),
            Arrays.asList(2, 5, 3, 1)
        );
        final int output = solution.maxScore(input);

        Assert.assertEquals(9, output);
    }

    @Test
    public void test2() {
        final MaximumDifferenceScoreInAGrid solution = new MaximumDifferenceScoreInAGrid();

        final List<List<Integer>> input = Arrays.asList(
            Arrays.asList(4, 3, 2),
            Arrays.asList(3, 2, 1)
        );
        final int output = solution.maxScore(input);

        Assert.assertEquals(-1, output);
    }
}
