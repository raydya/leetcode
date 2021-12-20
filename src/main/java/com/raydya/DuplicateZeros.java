package com.raydya;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        final int[] origin = arr.clone();
        int offset = 0;
        for (int i = 0; i < origin.length; i++) {
            final int k = origin[i];
            if (k == 0) {
                setValue(arr, i + offset, k);
                offset++;
            }
            setValue(arr, i + offset, k);
        }
    }

    private void setValue(int[] array, int k, int v) {
        if (k > array.length - 1) return;
        array[k] = v;
    }
}
