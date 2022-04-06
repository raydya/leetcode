package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class ReformatTheString {

    public String reformat(String s) {
        final List<Character> letters = new ArrayList<>();
        final List<Character> digits = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (Character.isLetter(c)) {
                letters.add(c);
            }
            if (Character.isDigit(c)) {
                digits.add(c);
            }
        }

        if (Math.abs(letters.size() - digits.size()) > 1) {
            return "";
        }

        final StringBuilder builder = new StringBuilder();
        int it = Math.max(letters.size(), digits.size());

        if (letters.size() > digits.size()) {
            for (int i = 0; i < it; i++) {
                if (i <= letters.size() - 1) {
                    builder.append(letters.get(i));
                }
                if (i <= digits.size() - 1) {
                    builder.append(digits.get(i));
                }
            }
        } else {
            for (int i = 0; i < it; i++) {
                if (i <= digits.size() - 1) {
                    builder.append(digits.get(i));
                }
                if (i <= letters.size() - 1) {
                    builder.append(letters.get(i));
                }
            }
        }

        return builder.toString();
    }
}
