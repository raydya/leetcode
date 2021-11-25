package com.raydya;

public class PartitionArrayIntoThreePartsWithEqualSum {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (final int i : arr) {
            sum += i;
        }

        int remainder = sum % 3;
        if (remainder > 0) return false;

        int ps = sum / 3;
        int i = 0;
        int t = 0;
        while (i < arr.length) {
            t += arr[i];
            if (t == ps) {
                break;
            }
            i++;
        }

        int j = arr.length - 1;
        t = 0;
        while (j >= 0) {
            t += arr[j];
            if (t == ps) {
                break;
            }
            j--;
        }

        t = 0;
        for (int k = i + 1; k < j; k++) {
            t += arr[k];
        }

        return i + 1 < j && t == ps;
    }
}
