package com.raydya;

public class SumOfTwoIntegers {
    public int getSum(int a, int b) {
        int result = a ^ b; // + without carry 0+0=0, 0+1=1+0=1, 1+1=0
        int carry = (a & b) << 1; // 1+1=2
        if (carry != 0) {
            return getSum(result, carry);
        }
        return result;
    }
}
