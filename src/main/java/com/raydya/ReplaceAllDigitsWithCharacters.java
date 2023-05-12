package com.raydya;

public class ReplaceAllDigitsWithCharacters {

    public String replaceDigits(String s) {
        final char[] chars = s.toCharArray();
        for (int i = 1; i < s.length(); i += 2) {
            final char c = s.charAt(i - 1);
            final int x = s.charAt(i) - '0';
            final int z = c - 'a' + x;
            final char a = (char) (z + 'a');
            chars[i] = a;
        }

        return String.valueOf(chars);
    }

}
