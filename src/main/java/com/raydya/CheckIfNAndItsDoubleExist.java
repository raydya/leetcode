package com.raydya;

import java.util.Arrays;

public class CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            final int k = arr[i];
            final int t = k * 2;
            final int j = Arrays.binarySearch(arr, t);
            if (j >= 0 && i != j) return true;
        }

        return false;
    }
}
