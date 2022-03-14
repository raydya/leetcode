package com.raydya;

public class NaYingBi {

    public int minCount(int[] coins) {
        int cnt = 0;
        for (final int coin : coins) {
            final int quotient = coin / 2;
            final int remainder = coin % 2;

            cnt = cnt + quotient + remainder;
        }

        return cnt;
    }
}
