package com.raydya;

import java.util.Arrays;

public class ValidSudoku {
    private static final int ASCII_TABLE_INDEX_ONE = 48;
    private static final int BOARD_SIZE = 9;

    public boolean isValidSudoku(char[][] board) {
        final int[] rTable = new int[BOARD_SIZE + 1];
        final int[] cTable = new int[BOARD_SIZE + 1];
        final int[] bTable = new int[BOARD_SIZE + 1];

        for (int i = 0; i < BOARD_SIZE; i++) {
            Arrays.fill(rTable, 0);
            Arrays.fill(cTable, 0);
            Arrays.fill(bTable, 0);

            for (int j = 0; j < BOARD_SIZE; j++) {
                // BOX CHECK
                int x = i % 3 * 3 + j % 3;
                int y = i / 3 * 3 + j / 3;
                final char b = getChar(board[y][x]);
                final int bi = b - ASCII_TABLE_INDEX_ONE;
                bTable[bi]++;
                if (bi != 0 && bTable[bi] > 1) return false;

                // ROW CHECK
                final char r = getChar(board[i][j]);
                final int ri = r - ASCII_TABLE_INDEX_ONE;
                rTable[ri]++;
                if (ri != 0 && rTable[ri] > 1) return false;

                // COLUMN CHECK
                final char c = getChar(board[j][i]);
                final int ci = c - ASCII_TABLE_INDEX_ONE;
                cTable[ci]++;
                if (ci != 0 && cTable[ci] > 1) return false;
            }
        }

        return true;
    }

    private char getChar(char c) {
        return c == '.' ? '0' : c;
    }
}
