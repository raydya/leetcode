package com.raydya;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StockPrice {

    private final Map<Integer, Integer> priceMap;
    private final TreeMap<Integer, Integer> prices;
    private int i;

    public StockPrice() {
        priceMap = new HashMap<>();
        prices = new TreeMap<>();
    }

    public void update(int timestamp, int price) {
        i = Math.max(timestamp, i);
        final Integer prevPrice = priceMap.getOrDefault(timestamp, 0);
        if (prevPrice > 0) {
            prices.put(prevPrice, prices.get(prevPrice) - 1);
            if (prices.get(prevPrice) == 0) {
                prices.remove(prevPrice);
            }
        }
        priceMap.put(timestamp, price);
        prices.put(price, prices.getOrDefault(price, 0) + 1);
    }

    public int current() {
        return priceMap.get(i);
    }

    public int maximum() {
        return prices.lastKey();
    }

    public int minimum() {
        return prices.firstKey();
    }
}
