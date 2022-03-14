package com.raydya;

public class AvailableCapturesForRook {

    private static final char ROOK = 'R';
    private static final char BISHOP = 'B';
    private static final char PAWN = 'p';

    public int numRookCaptures(char[][] board) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ROOK) {
                    x = j;
                    y = i;
                }
            }
        }

        int t = 0;

        // left
        for (int i = x - 1; i >= 0; i--) {
            final char c = board[y][i];
            if (c == BISHOP) {
                break;
            }
            if (c == PAWN) {
                t++;
                break;
            }
        }

        // right
        for (int i = x + 1; i < board[y].length; i++) {
            final char c = board[y][i];
            if (c == BISHOP) {
                break;
            }
            if (c == PAWN) {
                t++;
                break;
            }
        }

        // top
        for (int i = y - 1; i >= 0; i--) {
            final char c = board[i][x];
            if (c == BISHOP) {
                break;
            }
            if (c == PAWN) {
                t++;
                break;
            }
        }

        // bottom
        for (int i = y + 1; i < board.length; i++) {
            final char c = board[i][x];
            if (c == BISHOP) {
                break;
            }
            if (c == PAWN) {
                t++;
                break;
            }
        }

        return t;
    }
}
