package com.raydya;

public class ChuanDiXinXi {

    public int numWays(int n, int[][] relation, int k) {
        boolean[][] map = new boolean[n][n];
        // 记录传递关系
        for (int[] r : relation) {
            map[r[0]][r[1]] = true;
        }
        // dp[i][j]表示经历了i步，从开始的0传递到位置j，对应的方法数
        int[][] dp = new int[k + 1][n];
        dp[0][0] = 1;// 经历0步，只可以到达0位置，方法数是1
        for (int i = 1; i <= k; i++) {
            // 理解：每多走一步，遍历一次dp表，看是否需要更新
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < n; l++) {
                    if (map[j][l]) {
                        dp[i][l] += dp[i - 1][j];
                    }
                }
            }
        }
        return dp[k][n - 1];
    }
}
