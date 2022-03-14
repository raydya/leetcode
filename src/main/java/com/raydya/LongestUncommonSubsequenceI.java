package com.raydya;

public class LongestUncommonSubsequenceI {

    public int findLUSlength(String a, String b) {
        if (a.equals(b) || "".equals(a) || "".equals(b)) {
            return -1;
        }

        for (int i = a.length() - 1; i >= 0; i--) {
            final String s = a.substring(0, i);
            if (!s.equals(b)) {
                return Math.max(a.length(), b.length());
            }
        }

        return -1;
    }
}
