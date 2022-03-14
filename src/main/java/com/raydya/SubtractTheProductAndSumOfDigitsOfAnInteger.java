package com.raydya;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    public int subtractProductAndSum(int n) {
        final String s = String.valueOf(n);

        int pro = 1;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            final int num = c - '0';
            pro *= num;
            sum += num;
        }

        return pro - sum;
    }
}
