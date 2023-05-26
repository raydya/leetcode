package com.raydya;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class ShortestPathInBinaryMatrix {

    public int shortestPathBinaryMatrix(int[][] grid) {
        final int n = grid.length;
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) {
            return -1;
        }

        int[][] score = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(score[i], Integer.MAX_VALUE);
        }
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0, 0});
        score[0][0] = 1;

        while (!queue.isEmpty()) {
            int[] p = queue.poll();
            final int x = p[0];
            final int y = p[1];
            if (x == n - 1 && y == n - 1) {
                return score[x][y];
            }
            for (int dx = -1; dx <= 1; dx++) {
                for (int dy = -1; dy <= 1; dy++) {
                    final int xdx = x + dx;
                    final int ydy = y + dy;
                    if (xdx < 0 || xdx >= n || ydy < 0 || ydy >= n) {
                        continue;
                    }
                    if (grid[xdx][ydy] == 1) {
                        continue;
                    }
                    if (score[xdx][ydy] <= score[x][y] + 1) {
                        continue;
                    }
                    score[xdx][ydy] = score[x][y] + 1;
                    queue.offer(new int[]{xdx, ydy});

                }
            }
        }

        return -1;
    }
}
