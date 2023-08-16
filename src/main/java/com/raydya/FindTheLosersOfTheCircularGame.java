package com.raydya;

public class FindTheLosersOfTheCircularGame {

    public int[] circularGameLoser(int n, int k) {
        final boolean[] h = new boolean[n];
        int i = 0;
        int c = 1;
        while (!h[i]) {
            h[i] = true;
            i = (i + c * k) % n;
            c++;
        }

        int t = 0;
        for (final boolean b : h) {
            if (!b) {
                t += 1;
            }
        }

        final int[] ret = new int[t];
        int t2 = 0;
        for (int j = 0; j < h.length; j++) {
            if (!h[j]) {
                ret[t2] = j + 1;
                t2++;
            }
        }

        return ret;
    }

}
