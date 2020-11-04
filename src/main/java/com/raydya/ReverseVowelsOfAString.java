package com.raydya;

public class ReverseVowelsOfAString {
    private static final char[] VOWELS = new char[]{'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};

    public String reverseVowels(String s) {
        int l = 0;
        int r = s.length() - 1;

        char[] chars = s.toCharArray();

        while (l < r) {
            final char lc = chars[l];
            if (!isVowel(lc)) {
                l++;
                continue;
            }

            final char rc = chars[r];
            if (!isVowel(rc)) {
                r--;
                continue;
            }

            chars[r] = lc;
            chars[l] = rc;
            l++;
            r--;
        }

        return String.valueOf(chars);
    }

    private boolean isVowel(char s) {
        for (final char vowel : VOWELS) {
            if (s == vowel) return true;
        }

        return false;
    }
}
