package com.raydya;

public class ParkingSystem {
    private int bigCap;
    private int mediumCap;
    private int smallCap;

    public ParkingSystem(int big, int medium, int small) {
        bigCap = big;
        mediumCap = medium;
        smallCap = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                if (bigCap - 1 >= 0) {
                    bigCap -= 1;
                    return true;
                }
                return false;
            case 2:
                if (mediumCap - 1 >= 0) {
                    mediumCap -= 1;
                    return true;
                }
                return false;
            case 3:
                if (smallCap - 1 >= 0) {
                    smallCap -= 1;
                    return true;
                }
                return false;
            default:
                return false;
        }
    }
}
