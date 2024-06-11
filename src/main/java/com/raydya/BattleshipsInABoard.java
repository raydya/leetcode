package com.raydya;

public class BattleshipsInABoard {

    public int countBattleShips(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            final char[] chars = board[i];
            for (int j = 0; j < chars.length; j++) {
                final char aChar = chars[j];
                if (aChar == 'X') {
                    if (i > 0 && board[i - 1][j] == 'X') {
                        continue;
                    }
                    if (j > 0 && board[i][j - 1] == 'X') {
                        continue;
                    }
                    count++;
                }
            }
        }
        return count;
    }

}
