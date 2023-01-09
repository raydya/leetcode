package com.raydya;

public class CountGoodTriplets {

    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    final int v1 = arr[i];
                    final int v2 = arr[j];
                    final int v3 = arr[k];
                    if (Math.abs(v1 - v2) <= a
                        && Math.abs(v2 - v3) <= b
                        && Math.abs(v1 - v3) <= c) {
                        cnt++;
                    }
                }
            }
        }

        return cnt;
    }

}
