package com.raydya;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }

        final char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;

        while (j >= i) {
            final char a = chars[i];
            final char b = chars[j];

            if (!Character.isLetterOrDigit(a)) {
                i++;
                continue;
            }

            if (!Character.isLetterOrDigit(b)) {
                j--;
                continue;
            }

            if (Character.toLowerCase(a) != Character.toLowerCase(b)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
