package com.raydya;

public class GuessNumbers {
    public int game(int[] guess, int[] answer) {
        int cnt = 0;

        final int l = guess.length;

        for (int i = 0; i < l; i++) {
            if (guess[i] == answer[i]) {
                cnt++;
            }
        }

        return cnt;
    }
}
