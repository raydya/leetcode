package com.raydya;

public class StrongPasswordCheckerII {

    private static final String SPECIAL_STR = "!@#$%^&*()-+";

    public boolean strongPasswordCheckerII(String password) {
        final int length = password.length();
        if (length < 8) {
            return false;
        }

        int r = 0;
        char p = password.charAt(0);
        r = makeR(p, r);
        for (int i = 1; i < length; i++) {
            final char c = password.charAt(i);

            if (p == c) {
                return false;
            }

            r = makeR(c, r);

            p = c;
        }

        return r == 15;
    }

    private int makeR(char c, int r) {
        if (Character.isLetterOrDigit(c)) {
            final int l = c - 'a';
            if (l >= 0 && l < 26) {
                r = r | 1;
            }

            final int u = c - 'A';
            if (u >= 0 && u < 26) {
                r = r | 2;
            }

            if (Character.isDigit(c)) {
                r = r | 4;
            }
        } else {
            for (int j = 0; j < SPECIAL_STR.length(); j++) {
                final char sc = SPECIAL_STR.charAt(j);
                if (sc == c) {
                    r = r | 8;
                    break;
                }
            }
        }

        return r;
    }

}
