package com.raydya;

public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr.length <= 1) return false;
        if (arr[0] > arr[1]) return false;
        boolean increasing = true;
        int p = -1;

        for (final int i : arr) {
            if (i == p) return false;
            if (increasing) {
                if (i < p) {
                    increasing = false;
                }
            } else {
                if (i > p) return false;
            }
            p = i;
        }

        return !increasing;
    }
}
