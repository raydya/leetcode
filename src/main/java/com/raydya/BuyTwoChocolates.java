package com.raydya;

import java.util.Arrays;

public class BuyTwoChocolates {

    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);

        final int t = prices[0] + prices[1];
        if (t > money) {
            return money;
        }
        return money - t;
    }

}
