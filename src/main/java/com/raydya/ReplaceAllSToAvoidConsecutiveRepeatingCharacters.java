package com.raydya;

public class ReplaceAllSToAvoidConsecutiveRepeatingCharacters {
    public String modifyString(String s) {
        final char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            final char c = chars[i];
            if (c == '?') {
                int n = 0;
                int ln = -1;
                int rn = -1;
                if (i - 1 >= 0) {
                    final char l = chars[i - 1];
                    ln = l - 'a';
                }
                if (i + 1 < s.length()) {
                    final char r = chars[i + 1];
                    rn = r - 'a';
                }
                if (n == ln || n == rn) n++;
                if (n == ln || n == rn) n++;
                chars[i] = (char) (n + 'a');
            }
        }

        return String.valueOf(chars);
    }
}
