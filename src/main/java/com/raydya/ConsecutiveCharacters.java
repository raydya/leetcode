package com.raydya;

public class ConsecutiveCharacters {

    public int maxPower(String s) {
        int maxPower = 1;
        char p = s.charAt(0);
        int currentPower = 1;

        for (int i = 1; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (c == p) {
                currentPower++;
            } else {
                p = c;
                currentPower = 1;
            }
            maxPower = Math.max(maxPower, currentPower);
        }

        return maxPower;
    }
}
