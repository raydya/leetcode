package com.raydya;

public class LargestNumberAfterDigitSwapsByParity {

    public int largestInteger(int num) {
        final String s = String.valueOf(num);
        final char[] chars = s.toCharArray();
        final int[] cnt = new int[10];
        for (char c : chars) {
            cnt[c - '0']++;
        }
        for (int i = 0; i < chars.length; i++) {
            final char aChar = chars[i];
            final int k = aChar - '0';
            final boolean even = k % 2 == 0;
            if (even) {
                for (int j = 8; j >= 0; j -= 2) {
                    if (cnt[j] > 0) {
                        cnt[j]--;
                        chars[i] = (char) (j + '0');
                        break;
                    }
                }
            } else {
                for (int j = 9; j >= 0; j -= 2) {
                    if (cnt[j] > 0) {
                        cnt[j]--;
                        chars[i] = (char) (j + '0');
                        break;
                    }
                }
            }
        }
        final String str = String.valueOf(chars);
        return Integer.parseInt(str);
    }

}
