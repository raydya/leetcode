package com.raydya;

import java.util.HashSet;
import java.util.Set;

public class NumberOfDifferentIntegersInAString {

    public int numDifferentIntegers(String word) {
        char p = word.charAt(0);
        StringBuilder b = new StringBuilder();
        final Set<Integer> s = new HashSet<>();
        for (int i = 1; i < word.length(); i++) {
            final char c = word.charAt(i);
            if (Character.isDigit(c) && Character.isLetter(p)) {
                b.append(c);
            } else if (Character.isLetter(c) && Character.isDigit(p)) {
                final int k = Integer.parseInt(b.toString());
                s.add(k);
                b = new StringBuilder();
            } else {
                b.append(c);
            }
            p = c;
        }

        return s.size();
    }

}
