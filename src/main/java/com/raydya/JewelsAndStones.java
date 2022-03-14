package com.raydya;

public class JewelsAndStones {

    private static final int ALPHABET_LENGTH = 30;

    public int numJewelsInStones(String jewels, String stones) {
        final int[] alphabet = new int[ALPHABET_LENGTH * 2];
        for (int i = 0; i < jewels.length(); i++) {
            final char jewel = jewels.charAt(i);
            final int k = jewel - 'A';
            alphabet[k] = 1;
        }
        int cnt = 0;
        for (int i = 0; i < stones.length(); i++) {
            final char stone = stones.charAt(i);
            final int k = alphabet[stone - 'A'];
            if (k == 1) {
                cnt++;
            }
        }

        return cnt;
    }
}
