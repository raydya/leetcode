package com.raydya;

public class FindTheKBeautyOfANumber {

    public int divisorSubstrings(int num, int k) {
        final String s = String.valueOf(num);
        final int n = s.length();
        int ans = 0;
        for (int i = 0; i < n - k + 1; i++) {
            final String sub = s.substring(i, i + k);
            final int subNum = Integer.parseInt(sub);
            if (subNum == 0) {
                continue;
            }
            if (num % subNum == 0) {
                ans++;
            }
        }
        return ans;
    }

}
