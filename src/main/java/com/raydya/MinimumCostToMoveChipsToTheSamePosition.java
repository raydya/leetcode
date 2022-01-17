package com.raydya;

public class MinimumCostToMoveChipsToTheSamePosition {
    public int minCostToMoveChips(int[] position) {
        int odd = 0;
        int even = 0;
        for (final int p : position) {
            if (p % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return Math.min(odd, even);
    }
}
