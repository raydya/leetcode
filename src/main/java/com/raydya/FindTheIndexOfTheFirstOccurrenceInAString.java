package com.raydya;

public class FindTheIndexOfTheFirstOccurrenceInAString {

    public int strStr(String haystack, String needle) {
        int r = -1;
        final char f = needle.charAt(0);
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            final char c = haystack.charAt(i);
            if (c == f) {
                final String substring = haystack.substring(i, i + needle.length());
                if (substring.equals(needle)) {
                    r = i;
                    break;
                }
            }
        }

        return r;
    }

}
