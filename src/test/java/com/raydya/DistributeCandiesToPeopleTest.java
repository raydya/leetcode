package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DistributeCandiesToPeopleTest {

    @Test
    public void test1() {
        final DistributeCandiesToPeople solution = new DistributeCandiesToPeople();
        final int[] output = solution.distributeCandies(7, 4);

        Assert.assertArrayEquals(new int[]{1, 2, 3, 1}, output);
    }

    @Test
    public void test2() {
        final DistributeCandiesToPeople solution = new DistributeCandiesToPeople();
        final int[] output = solution.distributeCandies(10, 3);

        Assert.assertArrayEquals(new int[]{5, 2, 3}, output);
    }
}
