package com.raydya;

public class MinimumAmountOfTimeToCollectGarbage {

    public int garbageCollection(String[] garbage, int[] travel) {
        int totalMinutes = 0;
        int[] lastPos = new int[3]; // To store last positions of 'M', 'P', 'G'
        int[] totalGarbage = new int[3]; // To store total garbage of each type

        // Initializing with -1 since no garbage type is collected yet
        lastPos[0] = lastPos[1] = lastPos[2] = -1;

        // Mapping: 0 = 'M', 1 = 'P', 2 = 'G'
        for (int i = 0; i < garbage.length; i++) {
            for (char ch : garbage[i].toCharArray()) {
                int type = ch == 'M' ? 0 : (ch == 'P' ? 1 : 2);
                lastPos[type] = i;
                totalGarbage[type]++;
            }
        }

        // Calculate cumulative travel times
        int[] cumulativeTravel = new int[travel.length + 1];
        for (int i = 1; i < cumulativeTravel.length; i++) {
            cumulativeTravel[i] = cumulativeTravel[i - 1] + travel[i - 1];
        }

        // Calculate total time for each type of garbage collection
        for (int i = 0; i < 3; i++) {
            if (lastPos[i] != -1) {
                totalMinutes += totalGarbage[i]; // Add collection time
                totalMinutes += cumulativeTravel[lastPos[i]]; // Add travel time
            }
        }

        return totalMinutes;
    }

}
