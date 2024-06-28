package com.raydya;

import java.util.Arrays;

public class CheckDistancesBetweenSameLetters {

    public boolean checkDistances(String s, int[] distance) {
        final int[] alphabets = new int[26];
        Arrays.fill(alphabets, -1);
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            final int idx = c - 'a';
            if (alphabets[idx] == -1) {
                alphabets[idx] = i;
            } else {
                final int d = i - alphabets[idx] - 1;
                if (d != distance[idx]) {
                    return false;
                }
            }
        }

        return true;
    }

}
