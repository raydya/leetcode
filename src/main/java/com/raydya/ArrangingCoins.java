package com.raydya;

public class ArrangingCoins {
    public int arrangeCoins(int n) {
        int l = 0;

        while (n > l) {
            l++;
            final int i = n - l;
            if (i >= 1) {
                n = i;
            }
        }

        return l;
    }
}
