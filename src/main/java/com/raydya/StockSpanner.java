package com.raydya;

public class StockSpanner {

    private final int[] prices = new int[10000];
    private final int[] days = new int[10000];
    private int index = 0;

    public StockSpanner() {
    }

    public int next(int price) {
        int day = 1;
        int i = index - 1;
        while (i >= 0 && prices[i] <= price) {
            day += days[i];
            i -= days[i];
        }
        prices[index] = price;
        days[index] = day;
        index++;
        return day;
    }
}
