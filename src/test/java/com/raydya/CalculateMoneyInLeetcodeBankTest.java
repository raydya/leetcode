package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CalculateMoneyInLeetcodeBankTest {

    @Test
    public void test1() {
        final CalculateMoneyInLeetcodeBank solution = new CalculateMoneyInLeetcodeBank();
        final int output = solution.totalMoney(4);

        Assert.assertEquals(10, output);
    }

    @Test
    public void test2() {
        final CalculateMoneyInLeetcodeBank solution = new CalculateMoneyInLeetcodeBank();
        final int output = solution.totalMoney(10);

        Assert.assertEquals(37, output);
    }

    @Test
    public void test3() {
        final CalculateMoneyInLeetcodeBank solution = new CalculateMoneyInLeetcodeBank();
        final int output = solution.totalMoney(20);

        Assert.assertEquals(96, output);
    }
}
