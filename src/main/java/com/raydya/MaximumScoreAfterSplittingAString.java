package com.raydya;

public class MaximumScoreAfterSplittingAString {

    public int maxScore(String s) {
        int res = 0, cnt1 = 0, cnt0 = 0;
        for (int i = 0; i < s.length(); i++) {
            cnt1 += s.charAt(i) - '0';
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                cnt0++;
            } else {
                cnt1--;
            }
            res = Math.max(res, cnt0 + cnt1);
        }
        return res;
    }

}
