package com.raydya;

public class RemovePalindromicSubsequences {
    public int removePalindromeSub(String s) {
        final int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return 2;
            }
        }

        return 1;
    }
}
