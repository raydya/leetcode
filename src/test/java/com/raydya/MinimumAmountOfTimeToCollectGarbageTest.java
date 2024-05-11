package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumAmountOfTimeToCollectGarbageTest {

    @Test
    public void test1() {
        final MinimumAmountOfTimeToCollectGarbage solution = new MinimumAmountOfTimeToCollectGarbage();
        final int output = solution.garbageCollection(new String[]{"G", "P", "GP", "GG"}, new int[]{2, 4, 3});

        Assert.assertEquals(21, output);
    }

    @Test
    public void test2() {
        final MinimumAmountOfTimeToCollectGarbage solution = new MinimumAmountOfTimeToCollectGarbage();
        final int output = solution.garbageCollection(new String[]{"MMM", "PGM", "GP"}, new int[]{3, 10});

        Assert.assertEquals(37, output);
    }
}
