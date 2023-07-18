package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumDifferenceBetweenHighestAndLowestOfKScoresTest {

    @Test
    public void test1() {
        final MinimumDifferenceBetweenHighestAndLowestOfKScores solution = new MinimumDifferenceBetweenHighestAndLowestOfKScores();
        final int output = solution.minimumDifference(new int[]{90}, 1);

        Assert.assertEquals(0, output);
    }

    @Test
    public void test2() {
        final MinimumDifferenceBetweenHighestAndLowestOfKScores solution = new MinimumDifferenceBetweenHighestAndLowestOfKScores();
        final int output = solution.minimumDifference(new int[]{9, 4, 1, 7}, 2);

        Assert.assertEquals(2, output);
    }
}
