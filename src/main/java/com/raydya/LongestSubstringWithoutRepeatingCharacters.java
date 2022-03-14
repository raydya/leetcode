package com.raydya;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {

    private static final int NO_OF_CHARS = 256;

    public int lengthOfLongestSubstring(String s) {
        final int length = s.length();
        if (length == 0) {
            return 0;
        }

        int res = 0;

        final int[] lastIndex = new int[NO_OF_CHARS];
        Arrays.fill(lastIndex, -1);

        int left = 0;

        for (int i = 0; i < length; i++) {
            final char charAt = s.charAt(i);

            left = Math.max(left, lastIndex[charAt] + 1);

            res = Math.max(res, i - left + 1);

            lastIndex[charAt] = i;

//            System.out.printf("char is %s, left is %d, res is %d, last index is %d...%n", charAt, left, res, i);
        }

        return res;
    }
}
