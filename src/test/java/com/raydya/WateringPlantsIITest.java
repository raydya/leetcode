package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class WateringPlantsIITest {

    @Test
    public void test1() {
        final WateringPlantsII solution = new WateringPlantsII();
        final int output = solution.minimumRefill(new int[]{2, 2, 3, 3}, 5, 5);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final WateringPlantsII solution = new WateringPlantsII();
        final int output = solution.minimumRefill(new int[]{2, 2, 3, 3}, 3, 4);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final WateringPlantsII solution = new WateringPlantsII();
        final int output = solution.minimumRefill(new int[]{5}, 10, 8);

        Assert.assertEquals(0, output);
    }
}
