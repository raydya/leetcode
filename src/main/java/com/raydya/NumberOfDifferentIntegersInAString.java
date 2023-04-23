package com.raydya;

import java.util.HashSet;
import java.util.Set;

public class NumberOfDifferentIntegersInAString {

    public int numDifferentIntegers(String word) {
        StringBuilder b = new StringBuilder();
        final Set<String> s = new HashSet<>();
        final char f = word.charAt(0);
        if (Character.isDigit(f)) {
            b.append(f);
        }
        for (int i = 1; i < word.length(); i++) {
            final char c = word.charAt(i);
            if (Character.isDigit(c)) {
                b.append(c);
            } else {
                if (b.length() == 0) {
                    continue;
                }
                parse(b);
                if (b.length() == 0) {
                    s.add("0");
                } else {
                    s.add(b.toString());
                }
                b = new StringBuilder();
            }
        }

        if (b.length() != 0) {
            parse(b);

            if (b.length() == 0) {
                s.add("0");
            } else {
                s.add(b.toString());
            }
        }

        return s.size();
    }

    private void parse(StringBuilder b) {
        int d = -1;
        for (int j = 0; j < b.length(); j++) {
            final char k = b.charAt(j);
            if (k == '0') {
                d++;
            } else {
                break;
            }
        }

        if (d >= 0) {
            b.delete(0, d + 1);
        }
    }

}
