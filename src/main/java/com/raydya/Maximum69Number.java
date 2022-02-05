package com.raydya;

public class Maximum69Number {
    public int maximum69Number(int num) {
        final String s = String.valueOf(num);
        final char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            final char c = chars[i];
            if (c == '6') {
                chars[i] = '9';
                break;
            }
        }

        final String s1 = String.valueOf(chars);
        return Integer.parseInt(s1);
    }
}
