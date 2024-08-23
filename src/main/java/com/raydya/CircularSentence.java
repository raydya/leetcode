package com.raydya;

public class CircularSentence {

    public boolean isCircularSentence(String sentence) {
        final String[] words = sentence.split(" ");

        if (words.length == 1) {
            final String word = words[0];
            return word.charAt(0) == word.charAt(word.length() - 1);
        }

        String t = words[0];
        final String lw = words[words.length - 1];

        if (t.charAt(0) != lw.charAt(lw.length() - 1)) {
            return false;
        }

        for (int i = 1; i < words.length; i++) {
            final String c = words[i];
            final char tl = t.charAt(t.length() - 1);
            final char cf = c.charAt(0);
            if (tl == cf) {
                t = c;
                continue;
            }

            return false;
        }

        return true;
    }

}
