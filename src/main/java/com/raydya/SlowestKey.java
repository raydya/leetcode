package com.raydya;

public class SlowestKey {

    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int[] h = new int[26];

        int p = 0;
        for (int i = 0; i < releaseTimes.length; i++) {
            final char c = keysPressed.charAt(i);
            final int t = releaseTimes[i] - p;
            final int k = c - 'a';
            h[k] = Math.max(h[k], t);
            p = releaseTimes[i];
        }

        char r = 'a';
        int m = h[0];
        for (int i = 1; i < h.length; i++) {
            if (h[i] >= m) {
                r = (char) (i + 'a');
                m = h[i];
            }
        }

        return r;
    }

}
