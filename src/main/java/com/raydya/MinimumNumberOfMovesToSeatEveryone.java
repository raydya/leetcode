package com.raydya;

import java.util.Arrays;

public class MinimumNumberOfMovesToSeatEveryone {

    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int c = 0;
        for (int i = 0; i < seats.length; i++) {
            final int seat = seats[i];
            final int student = students[i];
            c += Math.abs(seat - student);
        }
        return c;
    }

}
