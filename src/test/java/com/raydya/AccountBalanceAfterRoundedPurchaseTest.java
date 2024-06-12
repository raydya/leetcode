package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class AccountBalanceAfterRoundedPurchaseTest {

    @Test
    public void test1() {
        final AccountBalanceAfterRoundedPurchase solution = new AccountBalanceAfterRoundedPurchase();
        final int output = solution.accountBalanceAfterPurchase(9);

        Assert.assertEquals(90, output);
    }

    @Test
    public void test2() {
        final AccountBalanceAfterRoundedPurchase solution = new AccountBalanceAfterRoundedPurchase();
        final int output = solution.accountBalanceAfterPurchase(15);

        Assert.assertEquals(80, output);
    }
}
