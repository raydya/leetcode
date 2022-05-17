package com.raydya;

public class NumberOfStudentsDoingHomeworkAtAGivenTime {

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        final int l = startTime.length;
        int t = 0;

        for (int i = 0; i < l; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                t++;
            }
        }

        return t;
    }

}
