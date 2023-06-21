package com.raydya;

import java.util.ArrayDeque;
import java.util.Queue;

public class FlipChess {

    private static final int[][] dirs = {
        {1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}
    };

    public int flipChess(String[] chessboard) {
        int res = 0;
        for (int i = 0; i < chessboard.length; ++i) {
            for (int j = 0; j < chessboard[0].length(); ++j) {
                if (chessboard[i].charAt(j) == '.') {
                    res = Math.max(res, bfs(chessboard, i, j));
                }
            }
        }
        return res;
    }

    public int bfs(String[] chessboard, int px, int py) {
        final int n = chessboard.length;
        final int m = chessboard[0].length();
        char[][] board = new char[n][m];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                board[i][j] = chessboard[i].charAt(j);
            }
        }
        int cnt = 0;
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{px, py});
        board[px][py] = 'X';
        while (!queue.isEmpty()) {
            int[] t = queue.poll();
            final int fx = t[0];
            final int fy = t[1];
            for (final int[] dir : dirs) {
                final int dx = dir[0];
                final int dy = dir[1];
                if (judge(board, fx, fy, dx, dy)) {
                    int x = fx + dx;
                    int y = fy + dy;
                    while (board[x][y] != 'X') {
                        queue.offer(new int[]{x, y});
                        board[x][y] = 'X';
                        x += dx;
                        y += dy;
                        ++cnt;
                    }
                }
            }
        }
        return cnt;
    }

    public boolean judge(char[][] board, int x, int y, int dx, int dy) {
        x += dx;
        y += dy;
        while (0 <= x && x < board.length && 0 <= y && y < board[0].length) {
            if (board[x][y] == 'X') {
                return true;
            } else if (board[x][y] == '.') {
                return false;
            }
            x += dx;
            y += dy;
        }
        return false;
    }
}
