package com.raydya;

public class DetermineTheWinnerOfABowlingGame {

    public int isWinner(int[] player1, int[] player2) {
        int p1 = 0;
        int p2 = 0;

        final int l = player1.length;

        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < l; i++) {
            final int k1 = player1[i];
            final int k2 = player2[i];
            if (c1 > 0) {
                p1 += 2 * k1;
                c1--;
            } else {
                p1 += k1;
            }

            if (c2 > 0) {
                p2 += 2 * k2;
                c2--;
            } else {
                p2 += k2;
            }

            if (k1 == 10) {
                c1 = 2;
            }
            if (k2 == 10) {
                c2 = 2;
            }
        }

        if (p1 > p2) {
            return 1;
        }
        if (p1 < p2) {
            return 2;
        }
        return 0;
    }

}
