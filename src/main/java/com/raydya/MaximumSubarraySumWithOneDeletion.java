package com.raydya;

public class MaximumSubarraySumWithOneDeletion {

    public int maximumSum(int[] arr) {
        // 没有删除过的状态值
        int dp0 = arr[0];
        // 删除过一次的状态值
        int dp1 = 0;
        int res = arr[0];

        for (int i = 1; i < arr.length; i++) {
            final int x = arr[i];
            // 本次删除过一次的值有两种情况
            // 1. 取上一次的已经删除过的dp1，所以必须加上本次的值，不可再删除，因为题目规定只能删除一次
            // 2. 取上一次前没有删除过的dp0，不能再加上本次的值
            // 两者取最大
            dp1 = Math.max(dp0, dp1 + x);
            // dp0相对比较简单，就是从头到位不删除任何值，一直累加
            // 但是因为是子数组的最大和，所以如果之前的和是负数，直接选择放弃从现值从新开始
            dp0 = Math.max(dp0, 0) + x;
            res = Math.max(res, Math.max(dp0, dp1));
        }

        return res;
    }

}
