package com.raydya;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int length = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            final char charAt = s.charAt(i);

            if (charAt == ' ') {
                if (length != 0) {
                    break;
                }
            } else {
                length++;
            }
        }

        return length;
    }
}
