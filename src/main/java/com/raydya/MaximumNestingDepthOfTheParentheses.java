package com.raydya;

public class MaximumNestingDepthOfTheParentheses {
    public int maxDepth(String s) {
        int lb = 0;
        int rb = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            switch (c) {
                case '(':
                    lb++;
                    break;
                case ')':
                    ans = Math.max(ans, lb - rb);
                    rb++;
                    break;
                default:
                    ans = Math.max(ans, lb - rb);
                    break;
            }
        }

        return ans;
    }
}
