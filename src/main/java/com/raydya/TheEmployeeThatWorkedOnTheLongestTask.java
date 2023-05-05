package com.raydya;

public class TheEmployeeThatWorkedOnTheLongestTask {

    public int hardestWorker(int n, int[][] logs) {
        int e = logs[0][0];
        int pt = logs[0][1];
        int mt = logs[0][1];
        for (int i = 1; i < logs.length; i++) {
            final int[] log = logs[i];
            final int p = log[0];
            final int t = log[1];
            final int ct = t - pt;
            if (ct > mt) {
                e = p;
            } else if (ct == mt) {
                e = Math.min(e, p);
            }
            mt = Math.max(ct, mt);
            pt = t;
        }

        return e;
    }

}
