package com.raydya;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class KidsWithTheGreatestNumberOfCandiesTest {

    @Test
    public void test1() {
        final KidsWithTheGreatestNumberOfCandies solution = new KidsWithTheGreatestNumberOfCandies();
        final List<Boolean> output = solution.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);

        Assert.assertArrayEquals(new Boolean[]{true, true, true, false, true}, output.toArray());
    }

    @Test
    public void test2() {
        final KidsWithTheGreatestNumberOfCandies solution = new KidsWithTheGreatestNumberOfCandies();
        final List<Boolean> output = solution.kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1);

        Assert.assertArrayEquals(new Boolean[]{true, false, false, false, false}, output.toArray());
    }

    @Test
    public void test3() {
        final KidsWithTheGreatestNumberOfCandies solution = new KidsWithTheGreatestNumberOfCandies();
        final List<Boolean> output = solution.kidsWithCandies(new int[]{12, 1, 12}, 10);

        Assert.assertArrayEquals(new Boolean[]{true, false, true}, output.toArray());
    }
}
