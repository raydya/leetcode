package com.raydya;

public class FindFirstPalindromicStringInTheArray {

    public String firstPalindrome(String[] words) {
        for (final String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }

        return "";
    }

    private boolean isPalindrome(String s) {
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
