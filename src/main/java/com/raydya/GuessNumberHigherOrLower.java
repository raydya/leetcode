package com.raydya;

public class GuessNumberHigherOrLower {
    public int guessNumber(int n, int pick) {
        int s = 1;
        int e = n;

        while (true) {
            final int guess = guess(n, pick);
            if (guess == -1) {
                e = n;
            } else if (guess == 1) {
                s = n;
            } else {
                return n;
            }

            n = s + (e - s) / 2;
        }
    }

    private int guess(int n, int pick) {
        if (pick < n) {
            return -1;
        } else if (pick > n) {
            return 1;
        }
        return 0;
    }
}
