package com.raydya;

public class MinimumChangesToMakeAlternatingBinaryString {

    public int minOperations(String s) {
        final StringBuilder sb1 = new StringBuilder();
        final StringBuilder sb2 = new StringBuilder();

        boolean f = true;
        for (int i = 0; i < s.length(); i++) {
            if (f) {
                sb1.append('0');
                sb2.append('1');
            } else {
                sb1.append('1');
                sb2.append('0');
            }
            f = !f;
        }

        final String s1 = sb1.toString();
        final String s2 = sb2.toString();

        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s1.charAt(i)) {
                cnt1++;
            }

            if (s.charAt(i) != s2.charAt(i)) {
                cnt2++;
            }
        }

        return Math.min(cnt1, cnt2);
    }

}
