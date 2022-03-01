package com.raydya;

import java.util.Arrays;

public class FindTheDistanceValueBetweenTwoArrays {

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int distance = 0;

        Arrays.sort(arr2);

        for (final int i : arr1) {
            boolean satisfied = true;
            for (int j = i - d; j <= i + d; j++) {
                final int k = Arrays.binarySearch(arr2, j);
                if (k >= 0) {
                    satisfied = false;
                    break;
                }
            }
            if (satisfied) {
                distance++;
            }
        }

        return distance;
    }

}
