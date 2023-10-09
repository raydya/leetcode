package com.raydya;

import java.util.Arrays;

public class SplitWithMinimumSum {

    public int splitNum(int num) {
        final String s = String.valueOf(num);
        final int[] ints = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            final int v = c - '0';
            ints[i] = v;
        }

        Arrays.sort(ints);

        int i = 0;
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        while (i < ints.length) {
            final int v = ints[i];
            final int r = i % 2;
            if (r == 0) {
                num1.append(v);
            } else {
                num2.append(v);
            }
            i++;
        }

        return Integer.parseInt(num1.toString()) + Integer.parseInt(num2.toString());
    }

}
