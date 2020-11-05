package com.raydya;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] holder1 = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            final char c = magazine.charAt(i);
            holder1[c - 97]++;
        }


        int[] holder2 = new int[26];

        for (int i = 0; i < ransomNote.length(); i++) {
            final char c = ransomNote.charAt(i);
            holder2[c - 97]++;
        }

        for (int i = 0; i < 26; i++) {
            if (holder1[i] < holder2[i]) return false;
        }

        return true;
    }
}
