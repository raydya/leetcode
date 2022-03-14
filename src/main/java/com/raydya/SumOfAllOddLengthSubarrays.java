package com.raydya;

public class SumOfAllOddLengthSubarrays {

    public int sumOddLengthSubarrays(int[] arr) {
        int ret = 0;
        for (int i = 1; i <= arr.length; i += 2) {
            for (int j = 0; j <= arr.length - i; j++) {
                for (int k = j; k < i + j; k++) {
                    ret += arr[k];
                }
            }
        }
        return ret;
    }
}
