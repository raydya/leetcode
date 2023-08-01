package com.raydya;

public class FinalValueOfVariableAfterPerformingOperations {

    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (final String operation : operations) {
            switch (operation) {
                case "++X":
                    x++;
                    break;
                case "X++":
                    ++x;
                    break;
                case "--X":
                    --x;
                    break;
                case "X--":
                    x--;
                    break;
                default:
                    break;
            }
        }
        return x;
    }

}
