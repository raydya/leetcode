package com.raydya;

public class RectangleOverlap {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int[] r1 = new int[]{rec2[0], rec2[1], rec1[2], rec1[3]};
        int[] r2 = new int[]{rec1[0], rec1[1], rec2[2], rec2[3]};
        return isOverlap(r1) && isOverlap(r2);
    }

    private boolean isOverlap(int[] rec) {
        final int x = rec[2] - rec[0];
        final int y = rec[3] - rec[1];

        return x > 0 && y > 0;
    }
}
