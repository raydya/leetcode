package com.raydya;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence {

    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);

        int gap = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if ((arr[i] - arr[i - 1]) != gap) {
                return false;
            }
        }

        return true;
    }
}
