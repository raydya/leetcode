package com.raydya;

public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        final String[] strings = s.split(" ");
        for (int i = 0; i < strings.length; i++) {
            final String word = strings[i];
            final int l = word.length();
            final char[] chars = new char[l];
            for (int j = 0; j < l; j++) {
                final char c = word.charAt(j);
                chars[l - j - 1] = c;
            }
            final String ns = String.valueOf(chars);
            strings[i] = ns;
        }
        return String.join(" ", strings);
    }
}
