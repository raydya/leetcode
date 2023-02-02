package com.raydya;

public class DetectPatternOfLengthMRepeatedKOrMoreTimes {

    public boolean containsPattern(int[] arr, int m, int k) {
        final StringBuilder sb = new StringBuilder();
        for (final int j : arr) {
            sb.append(j);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        final String s = sb.toString();
        sb.delete(0, sb.length());

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < m; j++) {
                if (i + j > arr.length - 1) {
                    return false;
                }
                sb.append(arr[i + j]);
                sb.append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
            final String cp = sb.toString();
            sb.delete(0, sb.length());

            for (int j = 0; j < k; j++) {
                sb.append(cp);
                sb.append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
            final String t = sb.toString();
            sb.delete(0, sb.length());
            if (s.contains(t)) {
                return true;
            }
        }

        return false;
    }

}
