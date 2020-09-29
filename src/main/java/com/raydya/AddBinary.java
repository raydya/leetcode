package com.raydya;

import java.util.Arrays;

public class AddBinary {

    public String addBinary(String a, String b) {
        final int aLen = a.length();
        final int bLen = b.length();

        final int diffLen = aLen - bLen;
        if (diffLen > 0) {
            for (int i = 0; i < diffLen; i++) {
                b = "0".concat(b);
            }
        } else {
            for (int i = 0; i < -diffLen; i++) {
                a = "0".concat(a);
            }
        }

        final int length = Math.max(aLen, bLen);

        final int[] ints = new int[length + 1];
        Arrays.fill(ints, 0);

        for (int i = length - 1; i >= 0; i--) {
            char charA = charAt(a, i);
            final char charB = charAt(b, i);

            if (charA == '1' && charB == '1') {
                ints[i] += 1;
            } else if (charA == '1' || charB == '1') {
                final int originIndex = i + 1;
                ints[originIndex] += 1;
                if (ints[originIndex] == 2) {
                    ints[i] += 1;
                    ints[originIndex] = 0;
                }
            }
        }

        String ret = "";

        for (final int anInt : ints) {
            final String s = String.valueOf(anInt);
            ret = ret.concat(s);
        }

        int index = 0;

        for (int i = 0; i < ret.length(); i++) {
            final char c = ret.charAt(i);
            if (c != '0' || i == ret.length() - 1) {
                index = i;
                break;
            }
        }

        return ret.substring(index);
    }

    private char charAt(String str, int index) {
        if ((index < 0) || (index >= str.length())) return '0';
        return str.charAt(index);
    }
}
