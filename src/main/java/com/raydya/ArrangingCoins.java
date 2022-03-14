package com.raydya;

public class ArrangingCoins {

    /**
     * we got O(log n) [binary search] & O(1) [math] solutions but i dont wanna implement it
     */
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
