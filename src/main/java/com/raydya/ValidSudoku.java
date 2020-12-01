package com.raydya;

public class ValidSudoku {
    private static final int ASCII_TABLE_INDEX_ONE = 48;
    private static final int BOARD_SIZE = 9;

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            int[] rTable = new int[BOARD_SIZE + 1];
            int[] cTable = new int[BOARD_SIZE + 1];
            int[] bTable = new int[BOARD_SIZE + 1];

            for (int j = 0; j < BOARD_SIZE; j++) {
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

                // BOX CHECK
                final int[] position = getPosition(i, j);
                int x = position[0];
                int y = position[1];
                final char b = getChar(board[y][x]);
                final int bi = b - ASCII_TABLE_INDEX_ONE;
                bTable[bi]++;
                if (bi != 0 && bTable[bi] > 1) return false;
            }
        }

        return true;
    }

    private char getChar(char c) {
        return c == '.' ? '0' : c;
    }

    public int[] getPosition(int boxNum, int boxIndex) {
        final int xOffset = boxNum % 3 * 3;
        final int yOffset = boxNum / 3 * 3;
        final int xValue = boxIndex % 3;
        final int yValue = boxIndex / 3;
        final int x = xOffset + xValue;
        final int y = yOffset + yValue;
        return new int[]{x, y};
    }
}
