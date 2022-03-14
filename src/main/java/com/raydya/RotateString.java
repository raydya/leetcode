package com.raydya;

public class RotateString {

    public boolean rotateString(String s, String goal) {
        final int l = s.length();
        for (int i = 0; i < l; i++) {
            final char p = s.charAt(0);
            final String r = s.substring(1, l);
            final String n = r.concat(String.valueOf(p));
            s = n;
            if (goal.equals(n)) {
                return true;
            }
        }
        return false;
    }
}
