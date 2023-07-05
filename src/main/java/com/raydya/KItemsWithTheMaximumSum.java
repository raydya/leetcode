package com.raydya;

public class KItemsWithTheMaximumSum {

    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int t = 0;
        int l = k - numOnes;
        if (l <= 0) {
            return k;
        }

        t += numOnes;
        l = l - numZeros;
        if (l <= 0) {
            return t;
        }

        t += l * -1;
        return t;
    }

}
