package com.raydya;

public class FindNearestPointThatHasTheSameXOrYCoordinate {

    public int nearestValidPoint(int x, int y, int[][] points) {
        int mManhattanDistance = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < points.length; i++) {
            final int[] point = points[i];
            if (isValid(x, y, point)) {
                final int d = manhattanDistance(x, y, point);
                if (d < mManhattanDistance) {
                    mManhattanDistance = d;
                    index = i;
                }
            }
        }

        return index;
    }

    private boolean isValid(int x, int y, int[] point) {
        return point[0] == x || point[1] == y;
    }

    private int manhattanDistance(int x, int y, int[] point) {
        return Math.abs(x - point[0]) + Math.abs(y - point[1]);
    }
}
