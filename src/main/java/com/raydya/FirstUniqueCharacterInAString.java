package com.raydya;

public class FirstUniqueCharacterInAString {
    public int firstUniqueChar(String s) {
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            count[index]++;
        }

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (count[index] == 1) return i;
        }

        return -1;
    }
}
