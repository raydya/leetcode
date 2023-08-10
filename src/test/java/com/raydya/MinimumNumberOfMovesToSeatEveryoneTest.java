package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumNumberOfMovesToSeatEveryoneTest {

    @Test
    public void test1() {
        final MinimumNumberOfMovesToSeatEveryone solution = new MinimumNumberOfMovesToSeatEveryone();
        final int output = solution.minMovesToSeat(new int[]{3, 1, 5}, new int[]{2, 7, 4});

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final MinimumNumberOfMovesToSeatEveryone solution = new MinimumNumberOfMovesToSeatEveryone();
        final int output = solution.minMovesToSeat(new int[]{4, 1, 5, 9}, new int[]{1, 3, 2, 6});

        Assert.assertEquals(7, output);
    }

    @Test
    public void test3() {
        final MinimumNumberOfMovesToSeatEveryone solution = new MinimumNumberOfMovesToSeatEveryone();
        final int output = solution.minMovesToSeat(new int[]{2, 2, 6, 6}, new int[]{1, 3, 2, 6});

        Assert.assertEquals(4, output);
    }

    @Test
    public void test4() {
        final MinimumNumberOfMovesToSeatEveryone solution = new MinimumNumberOfMovesToSeatEveryone();
        final int output = solution.minMovesToSeat(new int[]{12, 14, 19, 19, 12}, new int[]{19, 2, 17, 20, 7});

        Assert.assertEquals(19, output);
    }
}
