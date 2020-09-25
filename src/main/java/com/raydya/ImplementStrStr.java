package com.raydya;

public class ImplementStrStr {
    // KMP
    public int strStr(String haystack, String needle) {
        final int length = needle.length();
        if (length == 0) return 0;

        // needle current index
        int nc = 0;
        // haystack index, -1 for default
        int hsl = -1;

        // first needle char
        final char first = needle.charAt(0);

        // loop haystack
        for (int i = 0; i < haystack.length(); i++) {
            if (i + length > haystack.length() || nc == length) break;

            final char c = haystack.charAt(i);

            // current haystack char equals to first needle char
            if (c == first) {
                // if haystack index is -1, set it as current loop index
                if (hsl == -1) hsl = i;
                // need current index + 1
                nc++;
                // loop for next haystack chars and length equals to needle length
                // check if they are matched
                for (int j = i + 1; j < i + length; j++) {
                    final char s1 = haystack.charAt(j);
                    final char n1 = needle.charAt(nc);

                    if (s1 == n1) {
                        // if char are match, check next char
                        nc++;
                    } else {
                        // if mismatch, reset indices and go next haystack char
                        nc = 0;
                        hsl = -1;
                        break;
                    }
                }
            }
        }

        return hsl;
    }
}
