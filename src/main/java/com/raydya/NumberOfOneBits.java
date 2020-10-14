package com.raydya;

public class NumberOfOneBits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int weight = 0;
        for (int i = 0; i < 32; i++) {
            final int low = n & 1;
            if (low == 1) weight++;
            n >>= 1;
        }
        return weight;
    }
}
