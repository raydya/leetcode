package com.raydya;

public class FindTheHighestAltitude {

    public int largestAltitude(int[] gain) {
        int c = 0;
        int m = 0;

        for (final int g : gain) {
            c += g;
            m = Math.max(m, c);
        }

        return m;
    }

}
