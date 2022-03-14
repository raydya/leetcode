package com.raydya;

public class CheckIfItIsAStraightLine {

    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2) {
            return true;
        }
        for (int i = 0; i < coordinates.length - 2; i++) {
            if (!isLine(coordinates[i], coordinates[i + 1], coordinates[i + 2])) {
                return false;
            }
        }
        return true;
    }

    private boolean isLine(int[] p1, int[] p2, int[] p3) {
        return (p2[1] - p1[1]) * (p3[0] - p1[0]) == (p3[1] - p1[1]) * (p2[0] - p1[0]);
    }
}
