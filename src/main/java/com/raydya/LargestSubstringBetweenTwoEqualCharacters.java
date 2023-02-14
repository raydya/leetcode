package com.raydya;

import java.util.Arrays;

public class LargestSubstringBetweenTwoEqualCharacters {

    public int maxLengthBetweenEqualCharacters(String s) {
        final int[] m = new int[26];
        Arrays.fill(m, Integer.MAX_VALUE);
        final int[] n = new int[26];
        Arrays.fill(n, Integer.MIN_VALUE);

        int cnt = -1;

        for (int i = 0; i < s.length(); i++) {
            final int k = s.charAt(i) - 'a';
            m[k] = Math.min(m[k], i);
            n[k] = Math.max(n[k], i);
            cnt = Math.max(n[k] - m[k] - 1, cnt);
        }

        return cnt;
    }

}
