package com.raydya;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int buy = -1;
        int sell = -1;
        int max = -1;

        for (final int price : prices) {
            if (buy == -1 || price < buy) {
                buy = price;
                sell = -1;
            }
            if (sell == -1 || price > sell) {
                sell = price;
            }
            final int i = sell - buy;
            if (max == -1 || i > max) {
                max = i;
            }
        }

        return Math.max(max, sell - buy);
    }
}
