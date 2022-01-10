package com.raydya;

public class DistanceBetweenBusStops {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int clockwise = 0;
        int k = start;
        while (k != destination) {
            clockwise += distance[k];
            k++;
            if (k > distance.length - 1) k = 0;
        }

        int counterClockwise = 0;
        int t = start;
        while (t != destination) {
            t--;
            if (t < 0) t = distance.length - 1;
            counterClockwise += distance[t];
        }

        return Math.min(clockwise, counterClockwise);
    }
}
