package com.raydya;

public class UniqueBinarySearchTrees {

    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // j-1 on left * n-i on right + dp[i]
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }

    /* Mathematical Deduction
    * The sequence of G(n) function results is known as Catelan number C_n.
    public int numTrees(int n) {
        long C = 1;
        for (int i = 0; i < n; ++i) { // i stops at n - 1
            C = C * 2 * (2 * i + 1) / (i + 2); // calculate C_i+1
        }
        return (int) C;
    }
     */
}
