package com.raydya;

public class CountAsterisks {

    public int countAsterisks(String s) {
        int h = 0;
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (h == 2) {
                h = 0;
            }
            if (c == '|') {
                h++;
            }
            if (h == 0 && c == '*') {
                cnt++;
            }
        }

        return cnt;
    }

}
