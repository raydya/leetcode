package com.raydya;

import java.util.Arrays;
import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        final HashMap<String, Integer> map = new HashMap<String, Integer>() {{
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
        }};

        final int length = s.length();
        final int[] summary = new int[s.length()];
        Arrays.fill(summary, -1);

        for (int i = length - 1; i >= 0; i--) {
            if (summary[i] == 0) {
                continue;
            }
            final int leftIndex = i - 1;
            final String current = new String(new char[]{s.charAt(i)});
            final String left = leftIndex < 0 ? null : new String(new char[]{s.charAt(leftIndex)});

            if ("I".equals(left) && ("V".equals(current) || "X".equals(current))) {
                summary[i] = map.get(current) - 1;
                summary[leftIndex] = 0;
            } else if ("X".equals(left) && ("L".equals(current) || "C".equals(current))) {
                summary[i] = map.get(current) - 10;
                summary[leftIndex] = 0;
            } else if ("C".equals(left) && ("D".equals(current) || "M".equals(current))) {
                summary[i] = map.get(current) - 100;
                summary[leftIndex] = 0;
            } else {
                summary[i] = map.get(current);
            }
        }

        int total = 0;
        for (final int i : summary) {
            total += i;
        }

        return total;
    }
}
