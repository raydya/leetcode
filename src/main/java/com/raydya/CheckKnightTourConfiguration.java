package com.raydya;

public class CheckKnightTourConfiguration {

    private static class Coordinate {

        public final int row;
        public final int column;

        public Coordinate(final int row, final int column) {
            this.row = row;
            this.column = column;
        }
    }

    public boolean checkValidGrid(int[][] grid) {
        if (grid[0][0] != 0) {
            return false;
        }

        final Coordinate[] coordinates = new Coordinate[grid.length * grid.length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                final int c = grid[i][j];
                final Coordinate coordinate = new Coordinate(i, j);
                coordinates[c] = coordinate;
            }
        }

        Coordinate prev = coordinates[0];
        for (int i = 1; i < coordinates.length; i++) {
            final Coordinate cur = coordinates[i];
            if (validMove(prev, cur)) {
                prev = cur;
            } else {
                return false;
            }
        }

        return true;
    }

    private boolean validMove(Coordinate prev, Coordinate cur) {
        final int absRowDiff = Math.abs(cur.row - prev.row);
        final int absColumnDiff = Math.abs(cur.column - prev.column);
        if (absRowDiff == 1 && absColumnDiff == 2) {
            return true;
        }

        return absRowDiff == 2 && absColumnDiff == 1;
    }

}
