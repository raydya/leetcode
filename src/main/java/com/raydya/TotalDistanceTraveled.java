package com.raydya;

public class TotalDistanceTraveled {

    public int distanceTraveled(int mainTank, int additionalTank) {
        int distance = 0;

        while (mainTank >= 5) {
            distance += 50;
            mainTank -= 5;

            if (additionalTank > 0) {
                additionalTank--;
                mainTank++;
            }
        }

        return mainTank * 10 + distance;
    }

}
