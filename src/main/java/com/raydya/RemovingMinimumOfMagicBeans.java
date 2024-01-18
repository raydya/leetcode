package com.raydya;

import java.util.Arrays;

public class RemovingMinimumOfMagicBeans {


    public long minimumRemoval(int[] beans) {
        Arrays.sort(beans);
        int n = beans.length;
        long[] preSum = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            preSum[i] = preSum[i - 1] + beans[i - 1];
        }
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            //枚举每一个非空剩下的豆数为beans[i]
            if (i > 0 && beans[i - 1] == beans[i]) {
                continue;
            }
            long val = beans[i];
            ans = Math.min(ans, preSum[i] + (preSum[n] - preSum[i + 1]) - (val * (n - i - 1)));
        }
        return ans;
    }

}
