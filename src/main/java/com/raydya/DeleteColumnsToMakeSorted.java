package com.raydya;

public class DeleteColumnsToMakeSorted {
    public int minDeletionSize(String[] strs) {
        final int l = strs[0].length();

        int cnt = 0;
        for (int i = 0; i < l; i++) {
            char p = '0';
            for (final String str : strs) {
                final char c = str.charAt(i);
                final int k = c - p;
                if (k < 0) {
                    cnt++;
                    break;
                }
                p = c;
            }
        }

        return cnt;
    }
}
