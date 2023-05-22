package com.raydya;

public class SortingTheSentence {

    public String sortSentence(String s) {
        final String[] strs = s.split(" ");
        final String[] t = new String[strs.length];

        for (final String str : strs) {
            final char c = str.charAt(str.length() - 1);
            final int i = c - '0' - 1;
            final String k = str.substring(0, str.length() - 1);
            t[i] = k;
        }

        return String.join(" ", t);
    }

}
