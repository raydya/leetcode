package com.raydya;

public class SumOfSquareNumbers {

    public boolean judgeSquareSum(int c) {
        int s = (int) Math.sqrt(c);

        for (int i = s; i >= 0; i--) {
            final int k = (int) Math.pow(i, 2);
            final int j = c - k;
            final double v = Math.sqrt(j);
            if (v == (int) v) {
                return true;
            }
        }

        return false;
    }
}
