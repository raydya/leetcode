package com.raydya;

public class MakeTheStringGreat {

    public String makeGood(String s) {
        int k = -1;
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            final char p = i - 1 >= 0 ? s.charAt(i - 1) : '1';
            final char n = i + 1 < s.length() ? s.charAt(i + 1) : '1';
            if (Character.isUpperCase(c)) {
                final char sc = Character.toLowerCase(c);
                if (Character.isLowerCase(p)
                    && sc == p) {
                    k = i - 1;
                    break;
                }

                if (Character.isLowerCase(n)
                    && sc == n) {
                    k = i;
                    break;
                }
            }
        }

        if (k == -1) {
            return s;
        }

        final String r = s.substring(0, k) + s.substring(k + 2);
        return makeGood(r);
    }


}
