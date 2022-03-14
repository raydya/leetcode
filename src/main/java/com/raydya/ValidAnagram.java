package com.raydya;

public class ValidAnagram {
//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) return false;
//
//        final int[] h1 = new int[256];
//        final int[] h2 = new int[256];
//
//        for (int i = 0; i < s.length(); i++) {
//            final char c = s.charAt(i);
//            h1[c]++;
//        }
//
//        for (int i = 0; i < t.length(); i++) {
//            final char c = t.charAt(i);
//            h2[c]++;
//        }
//
//        return Arrays.equals(h1, h2);
//    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        final int[] table = new int[26];

        for (int i = 0; i < s.length(); i++) {
            final int c = s.charAt(i) - 'a';
            table[c]++;
        }

        for (int i = 0; i < t.length(); i++) {
            final int c = t.charAt(i) - 'a';
            table[c]--;

            if (table[c] < 0) {
                return false;
            }
        }

        return true;
    }
}
