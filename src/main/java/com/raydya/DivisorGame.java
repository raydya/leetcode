package com.raydya;

public class DivisorGame {

    public boolean divisorGame(int n) {
        if (n <= 1) {
            return false;
        }

        int x = 1;
        boolean isAlice = true;

        while (true) {
            n = n - x;
            if (n < 2) {
                break;
            }
            isAlice = !isAlice;
        }

        return isAlice;
    }
}
