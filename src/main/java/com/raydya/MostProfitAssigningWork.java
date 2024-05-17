package com.raydya;

public class MostProfitAssigningWork {

    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int max = 0;
        for (int i : difficulty) {
            max = Math.max(max, i);
        }

        final int[] dp = new int[max + 1];
        for (int i = 0; i < difficulty.length; i++) {
            dp[difficulty[i]] = Math.max(dp[difficulty[i]], profit[i]);
        }

        for (int i = 1; i < dp.length; i++) {
            dp[i] = Math.max(dp[i], dp[i - 1]);
        }

        int ret = 0;
        for (int i : worker) {
            if (i >= dp.length) {
                ret += dp[dp.length - 1];
            } else {
                ret += dp[i];
            }
        }

        return ret;
    }

}
