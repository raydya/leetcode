package com.raydya;

import java.util.Arrays;

public class CountPrimes {

    /*
     * Sieve_of_Eratosthenes
     * 埃拉托斯特尼筛法
     * https://zh.wikipedia.org/wiki/%E5%9F%83%E6%8B%89%E6%89%98%E6%96%AF%E7%89%B9%E5%B0%BC%E7%AD%9B%E6%B3%95
     */
    public int countPrimes(int n) {
        if (n <= 1) {
            return 0;
        }

        final boolean[] table = new boolean[n];
        Arrays.fill(table, true);

        int c = 0;

        final double sqrt = Math.sqrt(n);

        for (int i = 2; i < table.length; i++) {
            if (table[i]) {
                c++;

                if (i <= sqrt) {
                    for (int j = i * i; j < n; j += i) {
                        table[j] = false;
                    }
                }
            }
        }

        return c;
    }
}
