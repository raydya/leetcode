package com.raydya;

public class NumberOfWaysToBuyPensAndPencils {

    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        final int t1 = total / cost1;
        long c = 0;
        for (int i = 0; i <= t1; i++) {
            final int l = total - i * cost1;
            c += l / cost2;
        }

        return c + t1 + 1;
    }

}
