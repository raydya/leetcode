package com.raydya;

public class ZigZagConversion {
//    public String convert(String s, int numRows) {
//        if (numRows == 1) return s;
//
//        StringBuilder ret = new StringBuilder();
//        int n = s.length();
//        int cycleLen = 2 * numRows - 2;
//
//        for (int i = 0; i < numRows; i++) {
//            for (int j = 0; j + i < n; j += cycleLen) {
//                ret.append(s.charAt(j + i));
//                final int l = j + cycleLen - i;
//                if (i != 0 && i != numRows - 1 && l < n) {
//                    ret.append(s.charAt(l));
//                }
//            }
//        }
//        return ret.toString();
//    }

    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder ret = new StringBuilder();
        final int n = s.length();
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLen) {
                final int i1 = j + i;
                ret.append(s.charAt(i1));
                final int l = j + cycleLen - i;
                if (i != 0 && i != numRows - 1 && l < n) {
                    ret.append(s.charAt(l));
                }
            }
        }

        return ret.toString();
    }
}
