package com.raydya;

public class PassThePillow {

    public int passThePillow(int n, int time) {
        int i = 1;
        int p = 1;
        int c = 1;
        while (c <= time) {
            final int k = i + p;
            if (k == n || k == 1) {
                p = -p;
            }
            i = k;
            c++;
        }

        return i;
    }

}
