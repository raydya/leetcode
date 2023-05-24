package com.raydya;

public class LongerContiguousSegmentsOfOnesThanZeros {

    public boolean checkZeroOnes(String s) {
        char p = s.charAt(0);
        int pc = 1;
        int mzc = p == '0' ? 1 : 0;
        int moc = p == '1' ? 1 : 0;
        for (int i = 1; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (c == p) {
                pc++;
            } else {
                if (c == '0') {
                    moc = Math.max(pc, moc);
                } else {
                    mzc = Math.max(pc, mzc);
                }
                pc = 1;
            }
            p = c;
        }

        if (p == '0') {
            mzc = Math.max(pc, mzc);
        } else {
            moc = Math.max(pc, moc);
        }

        return moc > mzc;
    }

}
