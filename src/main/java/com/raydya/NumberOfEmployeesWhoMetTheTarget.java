package com.raydya;

import java.util.Arrays;

public class NumberOfEmployeesWhoMetTheTarget {

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        Arrays.sort(hours);

        int p = -1;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                p = i;
                break;
            }
        }

        return p == -1 ? 0 : hours.length - p;
    }

}
