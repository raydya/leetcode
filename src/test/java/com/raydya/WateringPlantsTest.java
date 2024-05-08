package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class WateringPlantsTest {

    @Test
    public void test1() {
        final WateringPlants solution = new WateringPlants();
        final int output = solution.wateringPlants(new int[]{2, 2, 3, 3}, 5);

        Assert.assertEquals(14, output);
    }

    @Test
    public void test2() {
        final WateringPlants solution = new WateringPlants();
        final int output = solution.wateringPlants(new int[]{1, 1, 1, 4, 2, 3}, 4);

        Assert.assertEquals(30, output);
    }

    @Test
    public void test3() {
        final WateringPlants solution = new WateringPlants();
        final int output = solution.wateringPlants(new int[]{7, 7, 7, 7, 7, 7, 7}, 8);

        Assert.assertEquals(49, output);
    }
}
