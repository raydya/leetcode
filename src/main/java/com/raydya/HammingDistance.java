package com.raydya;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int i = x ^ y;
        int cnt = 0;
        while (i != 0) {
            cnt += i & 1;
            i = i >> 1;
        }

        // return Integer.bitCount(i);
        return cnt;
    }
}
