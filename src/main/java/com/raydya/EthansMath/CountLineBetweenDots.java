package com.raydya.EthansMath;

public class CountLineBetweenDots {

    public int countLine(int dots) {
        int step = 0;
        int t = 0;
        while (dots > 0) {
            t += step;
            step++;
            dots--;
        }
        return t;
    }
}
