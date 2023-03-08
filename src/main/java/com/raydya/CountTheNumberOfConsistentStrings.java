package com.raydya;

public class CountTheNumberOfConsistentStrings {

    public int countConsistentStrings(String allowed, String[] words) {
        final boolean[] chars = new boolean[26];

        for (int i = 0; i < allowed.length(); i++) {
            final char c = allowed.charAt(i);
            chars[c - 'a'] = true;
        }

        int cnt = 0;
        for (final String word : words) {
            boolean f = true;
            for (int i = 0; i < word.length(); i++) {
                final char c = word.charAt(i);
                if (!chars[c - 'a']) {
                    f = false;
                    break;
                }
            }
            if (f) {
                cnt++;
            }
        }

        return cnt;
    }

}
