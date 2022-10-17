package com.raydya.ethan.math;

/**
 * 求解大于等于1的整数的平方根
 */
public class CalcSquareRoot {

    public double calc(int n, double deltaThreshold) {
        if (n < 1) {
            return -1.0;
        }
        double min = 1.0;
        double max = n;
        while (true) {
            // 二分后的可能的候选值
            final double mid = (min + max) / 2;
            // 候选值的平方
            final double sq = mid * mid;
            // 候选值的平方和原值的比较
            // 1 - 比较结果 = 实际误差精度
            double delta = Math.abs(1 - (sq / n));
            // 如果实际误差精度小于目标误差精度，返回候选值
            if (delta <= deltaThreshold) {
                return mid;
            }
            if (sq > n) {
                max = mid;
            } else {
                min = mid;
            }
        }
    }
}
