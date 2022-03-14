package com.raydya;

import java.util.HashMap;

public class ExcelSheetColumnNumber {

    private static final HashMap<String, Integer> MAP = new HashMap<String, Integer>() {
        {
            put("A", 1);
            put("B", 2);
            put("C", 3);
            put("D", 4);
            put("E", 5);
            put("F", 6);
            put("G", 7);
            put("H", 8);
            put("I", 9);
            put("J", 10);
            put("K", 11);
            put("L", 12);
            put("M", 13);
            put("N", 14);
            put("O", 15);
            put("P", 16);
            put("Q", 17);
            put("R", 18);
            put("S", 19);
            put("T", 20);
            put("U", 21);
            put("V", 22);
            put("W", 23);
            put("X", 24);
            put("Y", 25);
            put("Z", 26);
        }
    };

    public int titleToNumber(String s) {
        if (s.length() == 1) {
            return MAP.get(s);
        }

        final String prefix = s.substring(0, 1);
        final String suffix = s.substring(1);

        final Integer pv = MAP.get(prefix);
        return (int) (pv * Math.pow(26, (double) s.length() - 1) + titleToNumber(suffix));
    }
}
