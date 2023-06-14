package com.raydya;

public class SumOfDigitsOfStringAfterConvert {

    public int getLucky(String s, int k) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            final int idx = c - 'a' + 1;
            sb.append(idx);
        }

        String f = sb.toString();
        int sum = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < f.length(); j++) {
                final char c = f.charAt(j);
                final int v = c - '0';
                sum += v;
            }
            f = String.valueOf(sum);
            sum = 0;
        }

        return Integer.parseInt(f);
    }

}
