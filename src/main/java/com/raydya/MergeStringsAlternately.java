package com.raydya;

public class MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {
        int p1 = 0;
        int p2 = 0;

        StringBuilder builder = new StringBuilder();
        while (p1 < word1.length() || p2 < word2.length()) {
            if (p1 < word1.length()) {
                builder.append(word1.charAt(p1));
                p1++;
            }
            if (p2 < word2.length()) {
                builder.append(word2.charAt(p2));
                p2++;
            }
        }

        return builder.toString();
    }
}
