package com.raydya;

public class FindTheMinimumPossibleSumOfABeautifulArray {

    private static final long MOD = 1_000_000_007;

    public int minimumPossibleSum(int n, int target) {
        final int k = target / 2;

        if (k > n) {
            return (int) ((long) n * (n + 1)) / 2;
        }

        long sum = ((long) k * (k + 1)) / 2;  // 前k个自然数的和
        n -= k;

        long remainingSum = ((long) n * ((long) target + target + n - 1)) / 2;  // 剩余的n-k个数的和

        sum = (sum + remainingSum) % MOD;

        return (int) sum;
    }

}
