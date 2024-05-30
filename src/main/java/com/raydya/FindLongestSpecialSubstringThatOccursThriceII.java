package com.raydya;

public class FindLongestSpecialSubstringThatOccursThriceII {

    public int maximumLength(String s) {
        int[][] cnt = new int[26][3];

        for (int i = 0, j = 0; i < s.length(); i = j) {
            while (j < s.length() && s.charAt(j) == s.charAt(i)) {
                j++;
            }
            int index = s.charAt(i) - 'a';
            int len = j - i;
            if (len > cnt[index][0]) {
                cnt[index][2] = cnt[index][1];
                cnt[index][1] = cnt[index][0];
                cnt[index][0] = len;
            } else if (len > cnt[index][1]) {
                cnt[index][2] = cnt[index][1];
                cnt[index][1] = len;
            } else if (len > cnt[index][2]) {
                cnt[index][2] = len;
            }
        }

        int res = 0;
        for (int[] vec : cnt) {
            res = Math.max(res, Math.max(vec[0] - 2, Math.min(vec[0] - 1, vec[1])));
            res = Math.max(res, vec[2]);
        }
        return res != 0 ? res : -1;
    }
}
