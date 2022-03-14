package com.raydya;

public class BestTimeToBuyAndSellStockWithCoolDown {

    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int n = prices.length;
        // f[i][0]: 手上持有股票的最大收益
        // f[i][1]: 手上不持有股票，并且处于冷冻期中的累计最大收益
        // f[i][2]: 手上不持有股票，并且不在冷冻期中的累计最大收益
        int[][] f = new int[n][3];
        f[0][0] = -prices[0];
        for (int i = 1; i < n; ++i) {
            final int price = prices[i];
            final int[] y = f[i - 1];
            final int p1 = y[0];
            final int p2 = y[1];
            final int p3 = y[2];
            final int[] d = f[i];
            d[0] = Math.max(p1, p3 - price);
            d[1] = p1 + price;
            d[2] = Math.max(p2, p3);
        }
        return Math.max(f[n - 1][1], f[n - 1][2]);
    }
}
