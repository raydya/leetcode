package com.raydya;

public class RemoveDigitFromNumberToMaximizeResult {

    public String removeDigit(String number, char digit) {
        final StringBuilder sb = new StringBuilder();
        final int l = number.length();

        boolean removed = false;
        int last = -1;
        for (int i = 0; i < l; i++) {
            final char c = number.charAt(i);
            if (c == digit && !removed) {
                if (i == l - 1) {
                    removed = true;
                    continue;
                } else if (c - '0' < number.charAt(i + 1) - '0') {
                    removed = true;
                    continue;
                }
                last = i;
            }
            sb.append(c);
        }

        if (last != -1 && !removed) {
            sb.deleteCharAt(last);
        }

        return sb.toString();
    }

}
