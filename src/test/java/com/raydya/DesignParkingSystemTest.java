package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DesignParkingSystemTest {

  @Test
  public void test1() {
    DesignParkingSystem.ParkingSystem solution = new DesignParkingSystem.ParkingSystem(1, 1, 0);
    Assert.assertTrue(solution.addCar(1));
    Assert.assertTrue(solution.addCar(2));
    Assert.assertFalse(solution.addCar(3));
    Assert.assertFalse(solution.addCar(1));
  }

}
