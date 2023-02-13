package com.raydya;

import java.util.Arrays;

public class MeanOfArrayAfterRemovingSomeElements {

    public double trimMean(int[] arr) {
        final int l = arr.length;
        final int v = (int) (l * 0.05);
        Arrays.sort(arr);

        int t = 0;
        for (int i = v; i < arr.length - v; i++) {
            t += arr[i];
        }

        return t / (arr.length - 2.0 * v);
    }

}
