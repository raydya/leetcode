package com.raydya;

public class MaximumRepeatingSubstring {

    public int maxRepeating(String sequence, String word) {
        int cnt = 0;
        final StringBuilder b = new StringBuilder();
        b.append(word);
        while (true) {
            final int i = sequence.indexOf(b.toString());
            if (i < 0) {
                break;
            }
            b.append(word);
            cnt++;
        }
        return cnt;
    }
}
