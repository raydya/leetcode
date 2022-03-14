package com.raydya;

public class CheckIfNumbersAreAscendingInASentence {

    public boolean areNumbersAscending(String s) {
        int c = 0;

        StringBuilder k = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            final char at = s.charAt(i);
            if (at == ' ') {
                if (k.length() == 0) {
                    continue;
                }
                final int v = Integer.parseInt(k.toString());
                if (v <= c) {
                    return false;
                }
                k = new StringBuilder();
                c = v;
            } else {
                if (Character.isDigit(at)) {
                    k.append(at);
                }
            }
        }

        if (k.length() > 0) {
            final int v = Integer.parseInt(k.toString());
            return v > c;
        }

        return true;
    }
}
