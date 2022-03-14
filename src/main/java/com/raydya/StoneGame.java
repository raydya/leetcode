package com.raydya;

import java.util.Arrays;

public class StoneGame {

    public boolean stoneGame(int[] piles) {
        int length = piles.length;
        int[] dp = Arrays.stream(piles, 0, length).toArray();
        for (int i = length - 2; i >= 0; i--) {
            for (int j = i + 1; j < length; j++) {
                dp[j] = Math.max(piles[i] - dp[j], piles[j] - dp[j - 1]);
            }
        }
        return dp[length - 1] > 0;
    }
}
