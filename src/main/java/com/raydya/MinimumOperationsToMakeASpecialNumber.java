package com.raydya;

public class MinimumOperationsToMakeASpecialNumber {

    public int minimumOperations(String num) {
        int n = num.length();
        int minOps = n; // 最坏情况：删除所有数字

        // 检查是否可以通过删除所有非零数字得到0
        boolean hasZero = false;
        int nonZeroCount = 0;
        for (char c : num.toCharArray()) {
            if (c != '0') {
                nonZeroCount++;
            } else {
                hasZero = true;
            }
        }
        if (hasZero) {
            minOps = Math.min(minOps, nonZeroCount);
        }

        // 检查所有可能的子序列
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i - 1; j >= -1; j--) {
                int lastTwo = (j >= 0 ? num.charAt(j) - '0' : 0) * 10 + (num.charAt(i) - '0');
                if (lastTwo % 25 == 0) {
                    int ops = n - i - 1 + (i - j - 1);
                    minOps = Math.min(minOps, ops);
                }
            }
        }

        return minOps;
    }

}
