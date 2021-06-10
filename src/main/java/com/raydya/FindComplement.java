package com.raydya;

public class FindComplement {
    public int findComplement(int num) {
        final String s = Integer.toBinaryString(num);
        final char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i) == '0' ? '1' : '0';
            chars[i] = c;
        }

        return Integer.parseInt(String.valueOf(chars), 2);
    }
}
