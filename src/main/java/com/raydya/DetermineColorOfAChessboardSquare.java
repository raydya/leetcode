package com.raydya;

public class DetermineColorOfAChessboardSquare {

    public boolean squareIsWhite(String coordinates) {
        final int x = coordinates.charAt(0) - 'a';
        final int y = coordinates.charAt(1) - '1';

        final int m = x % 2;
        final int n = y % 2;

        return (m + n) == 1;
    }

}
