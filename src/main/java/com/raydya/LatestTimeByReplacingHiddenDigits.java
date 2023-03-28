package com.raydya;

public class LatestTimeByReplacingHiddenDigits {

    public String maximumTime(String time) {
        char h1 = time.charAt(0);
        char h2 = time.charAt(1);
        if (h1 == '?') {
            if (h2 == '?') {
                h1 = '2';
            } else if (h2 >= '4') {
                h1 = '1';
            } else {
                h1 = '2';
            }
        }
        if (h2 == '?') {
            if (h1 == '2') {
                h2 = '3';
            } else {
                h2 = '9';
            }
        }
        char m1 = time.charAt(3);
        if (m1 == '?') {
            m1 = '5';
        }
        char m2 = time.charAt(4);
        if (m2 == '?') {
            m2 = '9';
        }

        return String.valueOf(h1)
            + h2
            + ':'
            + m1
            + m2;
    }

}
