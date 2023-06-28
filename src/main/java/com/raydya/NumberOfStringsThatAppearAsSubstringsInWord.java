package com.raydya;

public class NumberOfStringsThatAppearAsSubstringsInWord {

    public int numOfStrings(String[] patterns, String word) {
        int c = 0;
        for (final String pattern : patterns) {
            if (word.contains(pattern)) {
                c++;
            }
        }

        return c;
    }

}
