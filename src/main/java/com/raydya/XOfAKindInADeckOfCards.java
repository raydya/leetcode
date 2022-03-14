package com.raydya;

public class XOfAKindInADeckOfCards {

    public boolean hasGroupsSizeX(int[] deck) {
        int[] count = new int[10000];
        for (final int i : deck) {
            count[i]++;
        }

        int g = -1;
        for (final int j : count) {
            if (j > 0) {
                if (g == -1) {
                    g = j;
                } else {
                    g = gcd(g, j);
                }
            }
        }

        return g >= 2;
    }

    public int gcd(int x, int y) {
        return x == 0 ? y : gcd(y % x, x);
    }
}
