package com.raydya;

public class TruncateSentence {

    public String truncateSentence(String s, int k) {
        final StringBuilder ret = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (c == ' ') {
                k--;
            }
            if (k == 0) {
                break;
            }
            ret.append(c);
        }

        return ret.toString();
    }
}
