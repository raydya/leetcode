package com.raydya;

public class GiveGem {

    public int giveGem(int[] gem, int[][] operations) {
        for (final int[] operation : operations) {
            final int s = operation[0];
            final int t = operation[1];

            final int k = gem[s];
            final int d = (int) Math.floor(k / 2.0);
            gem[t] += d;
            gem[s] -= d;

        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (final int j : gem) {
            max = Math.max(max, j);
            min = Math.min(min, j);
        }

        return max - min;
    }

}
