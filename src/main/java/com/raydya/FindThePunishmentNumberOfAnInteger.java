package com.raydya;

public class FindThePunishmentNumberOfAnInteger {

    public int punishmentNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            final int k = i * i;
            final String s = Integer.toString(k);
            if (dfs(s, 0, 0, i)) {
                sum += k;
            }
        }

        return sum;
    }

    public boolean dfs(String s, int pos, int tot, int target) {
        if (pos == s.length()) {
            return tot == target;
        }
        int sum = 0;
        for (int i = pos; i < s.length(); i++) {
            sum = sum * 10 + s.charAt(i) - '0';
            if (sum + tot > target) {
                break;
            }
            if (dfs(s, i + 1, sum + tot, target)) {
                return true;
            }
        }
        return false;
    }

}
