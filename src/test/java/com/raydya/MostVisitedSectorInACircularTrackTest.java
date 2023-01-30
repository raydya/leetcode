package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MostVisitedSectorInACircularTrackTest {

    @Test
    public void test1() {
        final MostVisitedSectorInACircularTrack solution = new MostVisitedSectorInACircularTrack();
        final List<Integer> output = solution.mostVisited(4, new int[]{1, 3, 1, 2});

        Assert.assertArrayEquals(new Integer[]{1, 2}, output.toArray());
    }

    @Test
    public void test2() {
        final MostVisitedSectorInACircularTrack solution = new MostVisitedSectorInACircularTrack();
        final List<Integer> output = solution.mostVisited(2, new int[]{2, 1, 2, 1, 2, 1, 2, 1, 2});

        Assert.assertArrayEquals(new Integer[]{2}, output.toArray());
    }

    @Test
    public void test3() {
        final MostVisitedSectorInACircularTrack solution = new MostVisitedSectorInACircularTrack();
        final List<Integer> output = solution.mostVisited(7, new int[]{1, 3, 5, 7});

        Assert.assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7}, output.toArray());
    }

    @Test
    public void test4() {
        final MostVisitedSectorInACircularTrack solution = new MostVisitedSectorInACircularTrack();
        final List<Integer> output = solution.mostVisited(2,
            new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1,
                2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1});

        Assert.assertArrayEquals(new Integer[]{1}, output.toArray());
    }
}
