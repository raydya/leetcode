package com.raydya;

public class NimGame {
    public boolean canWinNim(int n) {
        final int i = n % 4;

        return i != 0;
    }
}
