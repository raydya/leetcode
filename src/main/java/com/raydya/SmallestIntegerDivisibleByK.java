package com.raydya;

public class SmallestIntegerDivisibleByK {

    public int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0) {
            return -1;
        }
        int r = 1 % k, len = 1;
        while (r != 0) {
            r = (r * 10 + 1) % k;
            len++;
        }

        return len;
    }

}
