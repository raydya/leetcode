package com.raydya;

public class FindWinnerOnATicTacToeGame {

    public String tictactoe(int[][] moves) {
        final char[][] board = new char[3][3];

        int t = 0;
        for (int i = 0; i < moves.length; i++) {
            final int[] move = moves[i];
            final int x = move[0];
            final int y = move[1];
            final char c = i % 2 == 0 ? 'A' : 'B';
            board[x][y] = c;
            t++;
        }

        // diagonal
        if (board[1][1] != 0) {
            if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
                return String.valueOf(board[1][1]);
            }

            if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
                return String.valueOf(board[1][1]);
            }
        }

        for (int i = 0; i < 3; i++) {
            // row
            final char r = board[i][0];
            boolean rw = true;
            // column
            final char c = board[0][i];
            boolean cw = true;
            for (int j = 1; j < 3; j++) {
                if (r != board[i][j]) {
                    rw = false;
                }
                if (c != board[j][i]) {
                    cw = false;
                }
            }

            if (rw && r != 0) {
                return String.valueOf(r);
            }
            if (cw && c != 0) {
                return String.valueOf(c);
            }
        }

        return t == 9 ? "Draw" : "Pending";
    }
}
