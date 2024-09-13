package com.raydya;

public class TimeConversion {

    public String timeConversion(String s) {
        final char[] chars = s.toCharArray();

        int l = chars.length;
        char x = s.charAt(l - 2);
        if (x == 'A') {
            if (chars[0] == '1' && chars[1] == '2') {
                return "00" + s.substring(2, l - 2);
            }
            return s.substring(0, l - 2);
        }

        int h = Integer.parseInt(s.substring(0, 2));
        if (h >= 12) {
            return s.substring(0, l - 2);
        }

        int nh = h + 12;

        return nh + s.substring(2, l - 2);
    }
}
