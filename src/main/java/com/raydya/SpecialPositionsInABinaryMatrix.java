package com.raydya;

public class SpecialPositionsInABinaryMatrix {

    public int numSpecial(int[][] mat) {
        int cnt = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    boolean f = true;
                    for (int k = 0; k < mat.length; k++) {
                        if (i == k) {
                            continue;
                        }
                        ;
                        if (mat[k][j] != 0) {
                            f = false;
                            break;
                        }
                    }

                    for (int k = 0; k < mat[i].length; k++) {
                        if (k == j) {
                            continue;
                        }
                        if (mat[i][k] != 0) {
                            f = false;
                            break;
                        }
                    }

                    if (f) {
                        cnt++;
                    }
                }
            }
        }

        return cnt;
    }

}
