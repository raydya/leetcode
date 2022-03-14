package com.raydya;

public class ReplaceElementsWithGreatestElementOnRightSide {

    public int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            final int k = arr[i];
            arr[i] = max;
            max = Math.max(k, max);
        }

        return arr;
    }
}
