package com.raydya;

public class FindTheTownJudge {

    public int findJudge(int n, int[][] trust) {
        if (n == 1) {
            return 1;
        }
        int[] arr = new int[n + 1];
        for (final int[] ints : trust) {
            arr[ints[1]]++;
            arr[ints[0]]--;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n - 1) {
                return i;
            }
        }
        return -1;
    }
}
