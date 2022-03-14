package com.raydya;

public class FindNUniqueIntegersSumUpToZero {

    public int[] sumZero(int n) {
        final int[] ret = new int[n];
        int s = n / 2;
        final int length = ret.length;
        for (int i = 0; i < length / 2; i++) {
            ret[i] = -s;
            ret[length - 1 - i] = s;
            s--;
        }
        return ret;
    }
}
