package com.raydya;

public class ReversePrefixOfWord {

    public String reversePrefix(String word, char ch) {
        boolean f = true;
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            final char c = word.charAt(i);
            if (f) {
                sb.insert(0, c);
            } else {
                sb.append(c);
            }
            if (c == ch && f) {
                f = false;
            }
        }

        return f ? word : sb.toString();
    }

}
