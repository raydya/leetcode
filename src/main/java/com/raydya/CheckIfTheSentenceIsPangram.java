package com.raydya;

public class CheckIfTheSentenceIsPangram {

    public boolean checkIfPangram(String sentence) {
        boolean[] h = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            final char c = sentence.charAt(i);
            final int k = c - 'a';
            h[k] = true;
        }

        for (final boolean b : h) {
            if (!b) {
                return false;
            }
        }

        return true;
    }

}
