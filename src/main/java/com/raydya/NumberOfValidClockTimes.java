package com.raydya;

public class NumberOfValidClockTimes {

    public int countTime(String time) {
        int h = 0;
        int m = 0;

        final char h1 = time.charAt(0);
        final char h2 = time.charAt(1);
        final char m1 = time.charAt(3);
        final char m2 = time.charAt(4);

        for (int i = 0; i < 24; i++) {
            int hh = i / 10;
            int lh = i % 10;
            if ((h1 == '?' || h1 == hh + '0') &&
                (h2 == '?' || h2 == lh + '0')) {
                h++;
            }
        }

        for (int i = 0; i < 60; i++) {
            int hm = i / 10;
            int lm = i % 10;
            if ((m1 == '?' || m1 == hm + '0') &&
                (m2 == '?' || m2 == lm + '0')) {
                m++;
            }
        }
       
        return h * m;
    }

}
