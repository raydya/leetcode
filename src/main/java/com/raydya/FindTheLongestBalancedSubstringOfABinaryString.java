package com.raydya;

public class FindTheLongestBalancedSubstringOfABinaryString {

    public int findTheLongestBalancedSubstring(String s) {
        int l = s.length() / 2;
        while (l > 0) {
            final StringBuilder builder = new StringBuilder();
            for (int i = 0; i < l; i++) {
                builder.append('0');
            }
            for (int i = 0; i < l; i++) {
                builder.append('1');
            }
            final String str = builder.toString();
            final int i = s.indexOf(str);
            if (i >= 0) {
                return str.length();
            }
            l = l - 1;
        }

        return 0;
    }

}
