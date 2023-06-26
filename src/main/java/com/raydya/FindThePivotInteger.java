package com.raydya;

public class FindThePivotInteger {

    public int pivotInteger(int n) {
        final int[] h = new int[n + 1];
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += i;
            h[i] = s;
        }

        int t = 0;
        for (int i = n; i >= 1; i--) {
            t += i;
            if (h[i] == t) {
                return i;
            }
        }

        return -1;
    }
}
