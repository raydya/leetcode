package com.raydya;

public class FindSmallestLetterGreaterThanTarget {

    public char nextGreatestLetter(char[] letters, char target) {
        final int ia = target - 'a';
        char ret = letters[0];
        for (final char letter : letters) {
            final int il = letter - 'a';
            if (il > ia) {
                ret = letter;
                break;
            }
        }

        return ret;
    }
}
