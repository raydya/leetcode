package com.raydya;

public class PeakIndexInAMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int i = arr.length / 2;
        int s = 0;

        while (i > 0) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) break;
            if (arr[i] < arr[i + 1]) {
                s = i;
                i = s + (arr.length - s) / 2;
            } else {
                i = (s + i) / 2;
            }
        }

        return i;
    }
}
