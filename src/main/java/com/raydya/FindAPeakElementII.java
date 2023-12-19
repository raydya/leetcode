package com.raydya;

public class FindAPeakElementII {

    public int[] findPeakGrid(int[][] mat) {
        int[] res = new int[2];
        int m = mat.length, n = mat[0].length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            int maxRow = 0;
            for (int i = 0; i < m; i++) {
                if (mat[i][mid] > mat[maxRow][mid]) {
                    maxRow = i;
                }
            }
            boolean flag = true;
            if (mid - 1 >= 0 && mat[maxRow][mid - 1] > mat[maxRow][mid]) {
                right = mid - 1;
                flag = false;
            }
            if (mid + 1 < n && mat[maxRow][mid + 1] > mat[maxRow][mid]) {
                left = mid + 1;
                flag = false;
            }
            if (flag) {
                res[0] = maxRow;
                res[1] = mid;
                return res;
            }
        }
        return res;
    }

}
