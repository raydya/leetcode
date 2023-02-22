package com.raydya;

public class CheckArrayFormationThroughConcatenation {

    public boolean canFormArray(int[] arr, int[][] pieces) {
        final int[] h = new int[101];

        for (final int i : arr) {
            h[i]++;
        }

        for (final int[] piece : pieces) {
            if (piece.length == 1) {
                final int k = piece[0];
                if (h[k] == 0) {
                    return false;
                }
            } else {
                boolean match = false;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == piece[0]) {
                        for (int k = 1; k < piece.length; k++) {
                            if ((j + k) > (arr.length - 1) || piece[k] != arr[j + k]) {
                                return false;
                            }
                        }
                        match = true;
                    }
                }
                if (!match) {
                    return false;
                }
            }
        }

        return true;
    }

}
