package com.raydya;

public class CountBits {
    public int[] countBits(int num) {
        if (num == 0) {
            return new int[]{0};
        }
        if (num == 1) {
            return new int[]{0, 1};
        }
        final int[] h = new int[num + 1];
        h[1] = 1;
        h[2] = 1;
        for (int i = 3; i <= num; i++) {
            final int mod = i % 2;
            final int d = i / 2;
            if (mod == 0) {
                // even
                h[i] = h[d] + h[mod];
            } else {
                // odd
                h[i] = h[i - 1] + 1;
            }
        }
        return h;
    }
}
