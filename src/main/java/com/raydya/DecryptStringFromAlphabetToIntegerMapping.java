package com.raydya;

import java.util.HashMap;
import java.util.Map;

public class DecryptStringFromAlphabetToIntegerMapping {
    private final Map<String, String> map = new HashMap<String, String>() {{
        put("1", "a");
        put("2", "b");
        put("3", "c");
        put("4", "d");
        put("5", "e");
        put("6", "f");
        put("7", "g");
        put("8", "h");
        put("9", "i");
        put("10#", "j");
        put("11#", "k");
        put("12#", "l");
        put("13#", "m");
        put("14#", "n");
        put("15#", "o");
        put("16#", "p");
        put("17#", "q");
        put("18#", "r");
        put("19#", "s");
        put("20#", "t");
        put("21#", "u");
        put("22#", "v");
        put("23#", "w");
        put("24#", "x");
        put("25#", "y");
        put("26#", "z");
    }};

    public String freqAlphabets(String s) {
        final StringBuilder sb = new StringBuilder();

        int i = s.length() - 1;
        while (i >= 0) {
            final char c = s.charAt(i);
            String r;
            if (c == '#') {
                r = s.substring(i - 2, i + 1);
                i -= 3;
            } else {
                r = String.valueOf(c);
                i--;
            }
            final String k = map.get(r);
            sb.insert(0, k);
        }

        return sb.toString();
    }
}
