package com.raydya;

import java.util.List;

public class SumOfValuesAtIndicesWithKSetBits {

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            final String s = Integer.toBinaryString(i);
            final int length = s.length();
            int count = 0;
            for (int j = 0; j < length; j++) {
                final char c = s.charAt(j);
                if (c == '1') {
                    count++;
                }
            }
            if (count == k) {
                sum += nums.get(i);
            }
        }

        return sum;
    }

}
