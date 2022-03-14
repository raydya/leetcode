package com.raydya;

public class OneBitAndTwoBitCharacters {

    public boolean isOneBitCharacter(int[] bits) {
        int s = 0;
        for (int i = 0; i < bits.length - 1; i++) {
            if (i < s) {
                continue;
            }
            final int bit = bits[i];
            if (bit == 1) {
                s = i + 2;
            } else {
                s = i + 1;
            }
        }

        return s == bits.length - 1;
    }
}
