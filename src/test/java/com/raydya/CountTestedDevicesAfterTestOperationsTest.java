package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountTestedDevicesAfterTestOperationsTest {

    @Test
    public void test1() {

        final CountTestedDevicesAfterTestOperations solution = new CountTestedDevicesAfterTestOperations();
        final int output = solution.countTestedDevices(new int[]{1, 1, 2, 1, 3});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {

        final CountTestedDevicesAfterTestOperations solution = new CountTestedDevicesAfterTestOperations();
        final int output = solution.countTestedDevices(new int[]{0, 1, 2});

        Assert.assertEquals(2, output);
    }
}
