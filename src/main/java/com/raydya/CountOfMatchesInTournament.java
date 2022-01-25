package com.raydya;

public class CountOfMatchesInTournament {
    public int numberOfMatches(int n) {
        int t = 0;

        while (n > 1) {
            if (n % 2 == 0) {
                t += n / 2;
                n = n / 2;
            } else {
                t += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }

        return t;
    }
}
