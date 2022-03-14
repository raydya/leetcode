package com.raydya;

public class StudentAttendanceRecordI {

    public boolean checkRecord(String s) {
        final char[] chars = s.toCharArray();
        int aCnt = 0;
        int lCnt = 0;
        for (final char aChar : chars) {
            if (aChar == 'L') {
                lCnt++;
                if (lCnt > 2) {
                    return false;
                }
            } else {
                lCnt = 0;
            }
            if (aChar == 'A') {
                aCnt++;
                if (aCnt > 1) {
                    return false;
                }
            }
        }

        return true;
    }
}
