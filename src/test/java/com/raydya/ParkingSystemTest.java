package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ParkingSystemTest {
    @Test
    public void test1() {
        final ParkingSystem solution = new ParkingSystem(1, 1, 0);
        Assert.assertTrue(solution.addCar(1));
        Assert.assertTrue(solution.addCar(2));
        Assert.assertFalse(solution.addCar(3));
        Assert.assertFalse(solution.addCar(1));
    }
}
