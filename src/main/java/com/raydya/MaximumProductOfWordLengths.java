package com.raydya;

public class MaximumProductOfWordLengths {

    public int maxProduct(String[] words) {
        long[] bits = new long[words.length];
        for (int i = 0; i < words.length; i++) {
            bits[i] = getBits(words[i]);
        }

        int max = 0;
        for (int i = 0; i < bits.length; i++) {
            for (int j = i + 1; j < bits.length; j++) {
                if ((bits[i] & bits[j]) == 0) {
                    max = Math.max(max, words[i].length() * words[j].length());
                }
            }
        }

        return max;
    }

    private long getBits(String word) {
        long bits = 0;
        for (int i = 0; i < word.length(); i++) {
            bits |= 1L << (word.charAt(i) - 'a');
        }
        return bits;
    }

}
