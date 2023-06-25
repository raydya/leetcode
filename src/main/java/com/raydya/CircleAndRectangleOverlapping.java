package com.raydya;

public class CircleAndRectangleOverlapping {

    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        if (x1 <= xCenter && xCenter <= x2 && y1 <= yCenter && yCenter <= y2) {
            return true;
        }

        if (x2 <= xCenter && xCenter <= x1 && y2 <= yCenter && yCenter <= y1) {
            return true;
        }

        for (int i = x1; i <= x2; i++) {
            if (inCircle(i, y1, xCenter, yCenter, radius)) {
                return true;
            }

            if (inCircle(i, y2, xCenter, yCenter, radius)) {
                return true;
            }
        }

        for (int i = y1; i < y2; i++) {
            if (inCircle(x2, i, xCenter, yCenter, radius)) {
                return true;
            }

            if (inCircle(x1, i, xCenter, yCenter, radius)) {
                return true;
            }
        }

        return false;
    }

    private boolean inCircle(int x, int y, int cx, int cy, int radius) {
        final double dx = (double) x - cx;
        final double dy = (double) y - cy;
        final double d = Math.abs(Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2)));
        return d <= radius;
    }

}
