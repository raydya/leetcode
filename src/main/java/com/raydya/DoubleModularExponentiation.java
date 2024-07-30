package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class DoubleModularExponentiation {

    public List<Integer> getGoodIndices(int[][] variables, int target) {
        final List<Integer> res = new ArrayList<>();

        for (int i = 0; i < variables.length; i++) {
            final int[] variable = variables[i];
            final int a = variable[0];
            final int b = variable[1];
            final int c = variable[2];
            final int m = variable[3];

            // 计算 (a^b % 10)^c
            long power = 1;
            for (int j = 0; j < b; j++) {
                power = (power * a) % 10;
            }
            long value = 1;
            for (int j = 0; j < c; j++) {
                value = (value * power) % m;
            }

            // 检查是否满足条件
            if (value == target) {
                res.add(i);
            }
        }

        return res;
    }
}
