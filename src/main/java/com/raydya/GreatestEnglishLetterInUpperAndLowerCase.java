package com.raydya;

public class GreatestEnglishLetterInUpperAndLowerCase {

    public String greatestLetter(String s) {
        final boolean[] upper = new boolean[26];
        final boolean[] lower = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                upper[c - 'A'] = true;
            } else {
                lower[c - 'a'] = true;
            }
        }

        for (int i = 25; i >= 0; i--) {
            if (upper[i] && lower[i]) {
                return String.valueOf((char) ('A' + i));
            }
        }

        return "";
    }

}
