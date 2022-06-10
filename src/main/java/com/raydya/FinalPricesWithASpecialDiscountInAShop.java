package com.raydya;

public class FinalPricesWithASpecialDiscountInAShop {

    public int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            final int price = prices[i];
            int discount = 0;

            for (int j = i + 1; j < prices.length; j++) {
                final int p = prices[j];
                if (price >= p) {
                    discount = p;
                    break;
                }
            }

            prices[i] = price - discount;
        }

        return prices;
    }

}
