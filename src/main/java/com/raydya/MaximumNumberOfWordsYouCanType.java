package com.raydya;

public class MaximumNumberOfWordsYouCanType {

    public int canBeTypeWords(String text, String brokenLetters) {
        final String[] words = text.split(" ");
        int cnt = 0;

        for (final String word : words) {
            boolean f = true;
            for (int j = 0; j < word.length(); j++) {
                final char c = word.charAt(j);
                for (int k = 0; k < brokenLetters.length(); k++) {
                    final char b = brokenLetters.charAt(k);
                    if (c == b) {
                        f = false;
                        break;
                    }
                }
                if (!f) {
                    break;
                }
            }
            if (f) {
                cnt++;
            }
        }

        return cnt;
    }

}
