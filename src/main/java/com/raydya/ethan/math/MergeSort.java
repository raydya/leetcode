package com.raydya.ethan.math;

import java.util.Arrays;

public class MergeSort {

    public int[] mergeSort(int[] array) {
        if (array == null) {
            return new int[0];
        }

        // 如果只有一个数字，直接返回
        if (array.length == 1) {
            return array;
        }

        // 将数组分为左右两半
        final int mid = array.length / 2;
        final int[] left = Arrays.copyOfRange(array, 0, mid);
        final int[] right = Arrays.copyOfRange(array, mid, array.length);

        // 递归, 对两半分别进行排序
        final int[] leftSorted = mergeSort(left);
        final int[] rightSorted = mergeSort(right);

        // 合并排序后的两半数组
        return merge(leftSorted, rightSorted);
    }

    private int[] merge(final int[] a, final int[] b) {
        final int[] ret = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (j < a.length && k < b.length) {
            if (a[j] <= b[k]) {
                ret[i] = a[j];
                j++;
            } else {
                ret[i] = b[k];
                k++;
            }

            i++;
        }

        if (j < a.length) {
            for (int m = j; m < a.length; m++) {
                ret[i] = a[m];
                i++;
            }
        } else {
            for (int m = k; m < b.length; m++) {
                ret[i] = b[m];
                i++;
            }
        }

        return ret;
    }


}
