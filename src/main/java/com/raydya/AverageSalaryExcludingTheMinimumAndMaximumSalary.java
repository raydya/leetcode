package com.raydya;

import java.util.Arrays;

public class AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public double average(int[] salary) {
        Arrays.sort(salary);

        long t = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            t += salary[i];
        }

        return t / (double) (salary.length - 2);
    }
}
