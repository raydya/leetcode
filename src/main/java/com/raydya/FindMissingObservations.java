package com.raydya;

public class FindMissingObservations {

    public int[] missingRolls(int[] rolls, int mean, int n) {
        final int m = rolls.length;
        int sum = mean * (m + n);
        int observed = 0;
        for (final int roll : rolls) {
            observed += roll;
        }

        final int missedTotal = sum - observed;
        if (missedTotal < n || missedTotal > 6 * n) {
            return new int[]{};
        }

        final int[] ret = new int[n];
        final int avg = missedTotal / n;
        final int mod = missedTotal % n;
        for (int i = 0; i < n; i++) {
            ret[i] = avg + (i < mod ? 1 : 0);
        }
        return ret;
    }

}
