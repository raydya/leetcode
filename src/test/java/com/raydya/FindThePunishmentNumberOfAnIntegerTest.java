package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindThePunishmentNumberOfAnIntegerTest {

    @Test
    public void test1() {
        final FindThePunishmentNumberOfAnInteger solution = new FindThePunishmentNumberOfAnInteger();
        final int output = solution.punishmentNumber(10);

        Assert.assertEquals(182, output);
    }

    @Test
    public void test2() {
        final FindThePunishmentNumberOfAnInteger solution = new FindThePunishmentNumberOfAnInteger();
        final int output = solution.punishmentNumber(37);

        Assert.assertEquals(1478, output);
    }
}
