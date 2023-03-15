package com.raydya;

public class DetermineIfStringHalvesAreAlike {

    public boolean halvesAreAlike(String s) {
        int l = 0;
        int r = 0;

        for (int i = 0; i < s.length() / 2; i++) {
            final char c = s.charAt(i);
            if (isVowel(c)) {
                l++;
            }
        }

        for (int i = s.length() / 2; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (isVowel(c)) {
                r++;
            }
        }

        return l == r;
    }

    private boolean isVowel(char c) {
        final char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        for (final char vowel : vowels) {
            if (c == vowel) {
                return true;
            }
        }

        return false;
    }

}
