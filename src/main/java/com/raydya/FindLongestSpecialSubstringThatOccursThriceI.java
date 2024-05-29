package com.raydya;

import java.util.HashMap;

public class FindLongestSpecialSubstringThatOccursThriceI {

    public int maximumLength(String s) {
        HashMap<String, Integer> substringCount = new HashMap<>();

        int n = s.length();

        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);
            int j = i;

            // Find the length of the continuous substring of the same character
            while (j < n && s.charAt(j) == currentChar) {
                j++;
            }

            int length = j - i;
            for (int k = 1; k <= length; k++) {
                String specialSubstring = repeatChar(currentChar, k);
                substringCount.put(specialSubstring,
                    substringCount.getOrDefault(specialSubstring, 0) + (length - k + 1));
            }

            // Move the index to the end of the current special substring
            i = j - 1;
        }

        int maxLength = -1;

        // Find the longest special substring that appears at least 3 times
        for (String key : substringCount.keySet()) {
            if (substringCount.get(key) >= 3) {
                maxLength = Math.max(maxLength, key.length());
            }
        }

        return maxLength;
    }

    // Helper method to repeat a character for a given length
    private static String repeatChar(char c, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(c);
        }
        return sb.toString();
    }

}
