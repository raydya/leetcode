package com.raydya;

public class AccountBalanceAfterRoundedPurchase {

    public int accountBalanceAfterPurchase(int purchaseAmount) {
        return 100 - getRoundAmount(purchaseAmount);
    }

    private int getRoundAmount(int amount) {
        final int d = amount / 10;
        final int l = amount % 10;
        if (l >= 5) {
            return (d + 1) * 10;
        }
        return d * 10;
    }

}
