package com.raydya;

import java.util.Arrays;

public class PrimeArrangements {
    public int numPrimeArrangements(int n) {
        final int k = countPrimes(n);
        long ret = 1;
        final int MOD = (int) 1e9 + 7;

        for (int i = k; i > 0; i--) {
            ret = ret * i % MOD;
        }

        for (int i = n - k; i > 0; i--) {
            ret = ret * i % MOD;
        }

        return (int) ret % MOD;
    }

    private int countPrimes(int n) {
        if (n <= 1) return 0;

        final boolean[] table = new boolean[n + 1];
        Arrays.fill(table, true);
        table[0] = false;
        table[1] = false;

        final double sqrtN = Math.sqrt(n);
        int total = 0;

        for (int i = 2; i < table.length; i++) {
            if (table[i]) {
                total++;

                if (i <= sqrtN) {
                    for (int j = i * i; j <= n; j += i) {
                        table[j] = false;
                    }
                }
            }
        }

        return total;
    }
}
