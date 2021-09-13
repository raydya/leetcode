package com.raydya;

import java.util.Arrays;

public class ShortestDistanceToACharacter {
    public int[] shortestToChar(String s, char c) {
        final int[] ret = new int[s.length()];
        Arrays.fill(ret, Integer.MAX_VALUE);

        int pre = -1;
        for (int i = 0; i < s.length(); i++) {
            final char sc = s.charAt(i);

            if (sc == c) {
                int cnt = 1;
                ret[i] = 0;
                for (int j = i - 1; j >= 0; j--) {
                    if (j == pre) break;
                    ret[j] = Math.min(ret[j], cnt);
                    cnt++;
                }

                int cnt2 = 1;
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) == c) break;
                    ret[j] = Math.min(ret[j], cnt2);
                    cnt2++;
                }

                pre = i;
            }
        }

        return ret;
    }
}
