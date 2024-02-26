package com.raydya;

public class MinimumNumberOfOperationsToConvertTime {

    public int convertTime(String current, String correct) {
        final String[] currentSplit = current.split(":");
        final String[] correctSplit = correct.split(":");

        final int currentMinute = Integer.parseInt(currentSplit[0]) * 60 + Integer.parseInt(currentSplit[1]);

        final int correctMinute = Integer.parseInt(correctSplit[0]) * 60 + Integer.parseInt(correctSplit[1]);

        int minuteDiff = correctMinute - currentMinute;

        int operation = 0;

        final int[] ops = {60, 15, 5, 1};

        for (int i = 0; i < ops.length; i++) {
            final int op = ops[i];
            if (minuteDiff >= op) {
                final int diff = minuteDiff / op;
                operation += diff;
                minuteDiff = minuteDiff % op;
            }
        }

        return operation;
    }

}
