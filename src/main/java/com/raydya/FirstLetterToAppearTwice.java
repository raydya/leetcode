package com.raydya;

public class FirstLetterToAppearTwice {

    public char repeatedCharacter(String s) {
        final int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            final int idx = c - 'a';
            count[idx]++;
            if (count[idx] == 2) {
                return c;
            }
        }
        return ' ';
    }

}
