package com.raydya;

public class WalkingRobotSimulation {

    private static final int[] OPL_DIRECTIONS = new int[]{3, 0, 1, 2};
    private static final int[] OPR_DIRECTIONS = new int[]{1, 2, 3, 0};

    public int robotSim(int[] commands, int[][] obstacles) {
        int ml = Integer.MIN_VALUE;
        int x = 0;
        int y = 0;
        // 0-north, 1-east, 2-south, 3-west
        int d = 0;
        for (final int c : commands) {
            if (c == -2) {
                d = OPL_DIRECTIONS[d];
            } else if (c == -1) {
                d = OPR_DIRECTIONS[d];
            } else if (c > 0) {
                final int[] p = move(x, y, d, c, obstacles);
                x = p[0];
                y = p[1];
                final int dl = (int) Math.pow(x, 2) + (int) Math.pow(y, 2);
                ml = Math.max(ml, dl);
            }
        }

        return ml;
    }

    private int[] move(int x, int y, int d, int c, int[][] obstacles) {
        int dx = x;
        int dy = y;
        int t = c;
        while (t > 0) {
            switch (d) {
                case 0:
                    dy++;
                    if (isHit(dx, dy, obstacles)) {
                        dy--;
                        return new int[]{dx, dy};
                    }
                    break;
                case 1:
                    dx++;
                    if (isHit(dx, dy, obstacles)) {
                        dx--;
                        return new int[]{dx, dy};
                    }
                    break;
                case 2:
                    dy--;
                    if (isHit(dx, dy, obstacles)) {
                        dy++;
                        return new int[]{dx, dy};
                    }
                    break;
                case 3:
                    dx--;
                    if (isHit(dx, dy, obstacles)) {
                        dx++;
                        return new int[]{dx, dy};
                    }
                    break;
            }
            t--;
        }

        return new int[]{dx, dy};
    }

    private boolean isHit(int x, int y, int[][] obstacles) {
        for (final int[] obstacle : obstacles) {
            if (x == obstacle[0] && y == obstacle[1]) {
                return true;
            }
        }

        return false;
    }

}
