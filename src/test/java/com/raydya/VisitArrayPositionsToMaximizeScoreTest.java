package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class VisitArrayPositionsToMaximizeScoreTest {

    @Test
    public void test1() {
        final VisitArrayPositionsToMaximizeScore solution = new VisitArrayPositionsToMaximizeScore();
        final long output = solution.maxScore(new int[]{2, 3, 6, 1, 9, 2}, 5);

        Assert.assertEquals(13L, output);
    }

    @Test
    public void test2() {
        final VisitArrayPositionsToMaximizeScore solution = new VisitArrayPositionsToMaximizeScore();
        final long output = solution.maxScore(new int[]{2, 4, 6, 8}, 3);

        Assert.assertEquals(20L, output);
    }

    @Test
    public void test3() {
        final VisitArrayPositionsToMaximizeScore solution = new VisitArrayPositionsToMaximizeScore();
        final long output = solution.maxScore(new int[]{8, 50, 65, 85, 8, 73, 55, 50, 29, 95, 5, 68, 52, 79}, 74);

        Assert.assertEquals(470L, output);
    }
}
