package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindTheMostCompetitiveSubsequenceTest {

    @Test
    public void test1() {
        final FindTheMostCompetitiveSubsequence solution = new FindTheMostCompetitiveSubsequence();
        final int[] output = solution.mostCompetitive(new int[]{3, 5, 2, 6}, 2);

        Assert.assertArrayEquals(new int[]{2, 6}, output);
    }

    @Test
    public void test2() {
        final FindTheMostCompetitiveSubsequence solution = new FindTheMostCompetitiveSubsequence();
        final int[] output = solution.mostCompetitive(new int[]{2, 4, 3, 3, 5, 4, 9, 6}, 4);

        Assert.assertArrayEquals(new int[]{2, 3, 3, 4}, output);
    }
}
