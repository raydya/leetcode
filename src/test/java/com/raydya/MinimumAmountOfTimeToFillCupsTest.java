package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumAmountOfTimeToFillCupsTest {

    @Test
    public void test1() {
        final MinimumAmountOfTimeToFillCups solution = new MinimumAmountOfTimeToFillCups();
        final int output = solution.fillCups(new int[]{1, 4, 2});

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final MinimumAmountOfTimeToFillCups solution = new MinimumAmountOfTimeToFillCups();
        final int output = solution.fillCups(new int[]{5, 4, 4});

        Assert.assertEquals(7, output);
    }

    @Test
    public void test3() {
        final MinimumAmountOfTimeToFillCups solution = new MinimumAmountOfTimeToFillCups();
        final int output = solution.fillCups(new int[]{5, 0, 0});

        Assert.assertEquals(5, output);
    }

    @Test
    public void test4() {
        final MinimumAmountOfTimeToFillCups solution = new MinimumAmountOfTimeToFillCups();
        final int output = solution.fillCups(new int[]{0, 0, 0});

        Assert.assertEquals(0, output);
    }
}
