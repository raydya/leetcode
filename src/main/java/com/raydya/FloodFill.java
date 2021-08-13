package com.raydya;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        final int[][] res = image.clone();

        final int o = res[sr][sc];

        recursion(res, image, sr, sc, newColor, o);

        return res;
    }

    private void recursion(int[][] res, int[][] image, int r, int c, int v, int o) {
        if (r < 0 || c < 0 || r >= res.length || c >= res[0].length || res[r][c] == v) return;

        if (image[r][c] != o) return;

        res[r][c] = v;

        // top
        recursion(res, image, r - 1, c, v, o);

        // bottom
        recursion(res, image, r + 1, c, v, o);

        // left
        recursion(res, image, r, c - 1, v, o);

        // right
        recursion(res, image, r, c + 1, v, o);
    }
}
