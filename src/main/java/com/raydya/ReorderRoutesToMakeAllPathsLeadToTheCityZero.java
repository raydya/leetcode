package com.raydya;

public class ReorderRoutesToMakeAllPathsLeadToTheCityZero {

    public int minReorder(int n, int[][] connections) {
        boolean[] canReachZero = new boolean[n];
        canReachZero[0] = true;

        int res = 0;
        while (true) {
            boolean updated = false;
            for (int[] c : connections) {
                if (canReachZero[c[1]]) {
                    if (!canReachZero[c[0]]) {
                        canReachZero[c[0]] = true;
                        updated = true;
                    }
                } else if (canReachZero[c[0]]) {
                    canReachZero[c[1]] = true;
                    updated = true;
                    res++;
                }
            }
            if (!updated) {
                break;
            }
        }

        return res;
    }

}
