package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FilterRestaurantsByVeganFriendlyPriceAndDistanceTest {

    @Test
    public void test1() {
        final FilterRestaurantsByVeganFriendlyPriceAndDistance solution = new FilterRestaurantsByVeganFriendlyPriceAndDistance();
        final List<Integer> output = solution.filterRestaurants(
            new int[][]{{1, 4, 1, 40, 10}, {2, 8, 0, 50, 5}, {3, 8, 1, 30, 4}, {4, 10, 0, 10, 3}, {5, 1, 1, 15, 1}
            }, 1, 50, 10
        );

        Assert.assertArrayEquals(new Integer[]{3, 1, 5}, output.toArray());
    }

    @Test
    public void test2() {
        final FilterRestaurantsByVeganFriendlyPriceAndDistance solution = new FilterRestaurantsByVeganFriendlyPriceAndDistance();
        final List<Integer> output = solution.filterRestaurants(
            new int[][]{
                {1, 4, 1, 40, 10}, {2, 8, 0, 50, 5}, {3, 8, 1, 30, 4}, {4, 10, 0, 10, 3}, {5, 1, 1, 15, 1}
            }, 0, 50, 10
        );

        Assert.assertArrayEquals(new Integer[]{4, 3, 2, 1, 5}, output.toArray());
    }

    @Test
    public void test3() {
        final FilterRestaurantsByVeganFriendlyPriceAndDistance solution = new FilterRestaurantsByVeganFriendlyPriceAndDistance();
        final List<Integer> output = solution.filterRestaurants(
            new int[][]{
                {1, 4, 1, 40, 10}, {2, 8, 0, 50, 5}, {3, 8, 1, 30, 4}, {4, 10, 0, 10, 3}, {5, 1, 1, 15, 1}
            }, 0, 30, 3
        );

        Assert.assertArrayEquals(new Integer[]{4, 5}, output.toArray());
    }
}
