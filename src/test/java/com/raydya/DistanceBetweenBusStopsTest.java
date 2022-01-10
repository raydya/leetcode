package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DistanceBetweenBusStopsTest {
    @Test
    public void test1() {
        final DistanceBetweenBusStops solution = new DistanceBetweenBusStops();
        final int output = solution.distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 1);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final DistanceBetweenBusStops solution = new DistanceBetweenBusStops();
        final int output = solution.distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 2);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test3() {
        final DistanceBetweenBusStops solution = new DistanceBetweenBusStops();
        final int output = solution.distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 3);

        Assert.assertEquals(4, output);
    }

    @Test
    public void test4() {
        final DistanceBetweenBusStops solution = new DistanceBetweenBusStops();
        final int output = solution.distanceBetweenBusStops(new int[]{8, 11, 6, 7, 10, 11, 2}, 0, 3);

        Assert.assertEquals(25, output);
    }

    @Test
    public void test5() {
        final DistanceBetweenBusStops solution = new DistanceBetweenBusStops();
        final int output = solution.distanceBetweenBusStops(new int[]{7, 10, 1, 12, 11, 14, 5, 0}, 7, 2);

        Assert.assertEquals(17, output);
    }

    @Test
    public void test6() {
        final DistanceBetweenBusStops solution = new DistanceBetweenBusStops();
        final int output = solution.distanceBetweenBusStops(new int[]{3, 6, 7, 2, 9, 10, 7, 16, 11}, 6, 2);

        Assert.assertEquals(28, output);
    }
}
