package com.raydya;

public class DefuseTheBomb {

    public int[] decrypt(int[] code, int k) {
        final int l = code.length;
        int[] r = new int[l];
        if (k == 0) {
            return r;
        }
        if (k > 0) {
            for (int i = 0; i < l; i++) {
                int s = 0;
                int p = k;
                while (p > 0) {
                    final int f = i + p;
                    int j = f >= l ? f - l : f;
                    s += code[j];
                    p--;
                }
                r[i] = s;
            }
        } else {
            for (int i = 0; i < l; i++) {
                int s = 0;
                int p = Math.abs(k);
                while (p > 0) {
                    final int f = i - p;
                    int j = f < 0 ? f + l : f;
                    s += code[j];
                    p--;
                }
                r[i] = s;
            }
        }

        return r;
    }

}
