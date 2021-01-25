package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class RestoreIPAddressesTest {
    @Test
    public void test1() {
        final RestoreIPAddresses solution = new RestoreIPAddresses();
        final List<String> output = solution.restoreIpAddresses("25525511135");

        Assert.assertArrayEquals(new String[]{"255.255.11.135", "255.255.111.35"}, output.toArray());
    }

    @Test
    public void test2() {
        final RestoreIPAddresses solution = new RestoreIPAddresses();
        final List<String> output = solution.restoreIpAddresses("0000");

        Assert.assertArrayEquals(new String[]{"0.0.0.0"}, output.toArray());
    }

    @Test
    public void test3() {
        final RestoreIPAddresses solution = new RestoreIPAddresses();
        final List<String> output = solution.restoreIpAddresses("010010");

        Assert.assertArrayEquals(new String[]{"0.10.0.10", "0.100.1.0"}, output.toArray());
    }

    @Test
    public void test4() {
        final RestoreIPAddresses solution = new RestoreIPAddresses();
        final List<String> output = solution.restoreIpAddresses("101023");

        Assert.assertArrayEquals(new String[]{"1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3"}, output.toArray());
    }
}
