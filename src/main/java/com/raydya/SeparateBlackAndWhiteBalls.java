package com.raydya;

public class SeparateBlackAndWhiteBalls {

    public long minimumSteps(String s) {
        long moves = 0, blackCount = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                blackCount++;
            } else { // c == '0'
                moves += blackCount;
            }
        }
        return moves;
    }

}
