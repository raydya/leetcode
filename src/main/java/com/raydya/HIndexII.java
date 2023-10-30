package com.raydya;

public class HIndexII {

    public int hIndex(int[] citations) {
        if (citations.length == 1) {
            return citations[citations.length - 1] == 0 ? 0 : 1;
        }

        int s = 0;
        int e = citations.length - 1;
        int i = (s + e) / 2;

        while (e > s && e - s > 1) {
            final int c = citations[i];
            final int l = citations.length - i;
            if (c == l) {
                return c;
            }
            if (c > l) {
                e = i;
            } else {
                s = i;
            }
            i = (s + e) / 2;
        }

        return Math.max(Math.min(citations[s], citations.length - s), Math.min(citations[e], citations.length - e));
    }

}
