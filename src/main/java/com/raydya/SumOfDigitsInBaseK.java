package com.raydya;

public class SumOfDigitsInBaseK {

    public int sumBase(int n, int k) {
        int t = 0;

        while (true) {
            final int i = n / k;
            final int j = n % k;
            t += j;
            if (i < k) {
                t += i;
                break;
            }
            n = i;
        }

        return t;
    }

}
