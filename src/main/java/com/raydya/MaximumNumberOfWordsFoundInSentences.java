package com.raydya;

public class MaximumNumberOfWordsFoundInSentences {

    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (final String sentence : sentences) {
            int cnt = 0;
            for (int i = 0; i < sentence.length(); i++) {
                final char c = sentence.charAt(i);
                if (c == ' ') {
                    cnt++;
                }
            }
            max = Math.max(max, cnt + 1);
        }
        return max;
    }

}
