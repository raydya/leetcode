package com.raydya;

public class ConvertIntegerToTheSumOfTwoNoZeroIntegers {

    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            final int j = n - i;
            if (isNoZeroInteger(i) && isNoZeroInteger(j)) {
                return new int[]{i, j};
            }
        }
        return new int[]{};
    }

    private boolean isNoZeroInteger(int i) {
        final String s = String.valueOf(i);
        for (int j = 0; j < s.length(); j++) {
            final char c = s.charAt(j);
            if (c == '0') {
                return false;
            }
        }
        return true;
    }
}
