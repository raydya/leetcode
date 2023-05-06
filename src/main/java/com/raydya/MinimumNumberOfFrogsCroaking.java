package com.raydya;

import java.util.HashMap;
import java.util.Map;

public class MinimumNumberOfFrogsCroaking {

    public int minNumberOfFrogs(String croakOfFrogs) {
        if (croakOfFrogs.length() % 5 > 0) {
            return -1;
        }

        final Map<Character, Integer> m = new HashMap<Character, Integer>() {
            {
                put('c', 0);
                put('r', 1);
                put('o', 2);
                put('a', 3);
                put('k', 4);
            }
        };

        int r = 0;
        int n = 0;
        int[] cnt = new int[4];

        for (int i = 0; i < croakOfFrogs.length(); i++) {
            final char c = croakOfFrogs.charAt(i);
            final int k = m.get(c);
            if (k == 0) {
                cnt[k]++;
                n++;
                if (n > r) {
                    r = n;
                }
            } else {
                if (cnt[k - 1] == 0) {
                    return -1;
                }
                cnt[k - 1]--;
                if (k == 4) {
                    n--;
                } else {
                    cnt[k]++;
                }
            }
        }
        if (n > 0) {
            return -1;
        }

        return r;
    }

}
