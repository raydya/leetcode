package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DefangingAnIpAddressTest {

    @Test
    public void test1() {
        final DefangingAnIpAddress solution = new DefangingAnIpAddress();
        final String output = solution.defangIPaddr("1.1.1.1");

        Assert.assertEquals("1[.]1[.]1[.]1", output);
    }

    @Test
    public void test2() {
        final DefangingAnIpAddress solution = new DefangingAnIpAddress();
        final String output = solution.defangIPaddr("255.100.50.0");

        Assert.assertEquals("255[.]100[.]50[.]0", output);
    }
}
