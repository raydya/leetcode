package com.raydya;

public class ValidPalindromeII {

    public boolean validPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }

        final char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        boolean valid = true;

        while (j >= i) {
            final char a = chars[i];
            final char b = chars[j];

            if (a != b) {
                valid = false;
                break;
            }

            i++;
            j--;
        }

        if (valid) {
            return true;
        }

        final String s1 = s.substring(i + 1, j + 1);
        final String s2 = s.substring(i, j);

        return isValid(s1) || isValid(s2);
    }

    private boolean isValid(String s) {
        if (s.isEmpty()) {
            return true;
        }

        final char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;

        while (j >= i) {
            final char a = chars[i];
            final char b = chars[j];

            if (a != b) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
