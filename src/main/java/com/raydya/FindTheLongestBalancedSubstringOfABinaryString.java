package com.raydya;

public class FindTheLongestBalancedSubstringOfABinaryString {

    public int findTheLongestBalancedSubstring(String s) {
        int res = 0;
        int n = s.length();
        int[] count = new int[2];
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                count[1]++;
                res = Math.max(res, 2 * Math.min(count[0], count[1]));
            } else if (i == 0 || s.charAt(i - 1) == '1') {
                count[0] = 1;
                count[1] = 0;
            } else {
                count[0]++;
            }
        }
        return res;
    }

}
