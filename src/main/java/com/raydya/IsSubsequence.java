package com.raydya;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;

        int l = 0;
        int r = 0;

        while (r < t.length()) {
            if (l >= s.length()) break;

            final char sc = s.charAt(l);
            final char tc = t.charAt(r);

            if (sc == tc) {
                l++;
            }
            r++;
        }

        return l == s.length();
    }
}
