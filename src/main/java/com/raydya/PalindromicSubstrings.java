package com.raydya;

public class PalindromicSubstrings {
    public int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                final String substring = s.substring(i, j + 1);
                final boolean isPalindrome = isPalindrome(substring);
                if (isPalindrome) {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean isPalindrome(String s) {
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
