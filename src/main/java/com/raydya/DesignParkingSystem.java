package com.raydya;

public class DesignParkingSystem {

    public static class ParkingSystem {

        private int bigSlot;
        private int mediumSlot;
        private int smallSlot;

        public ParkingSystem(int big, int medium, int small) {
            this.bigSlot = big;
            this.mediumSlot = medium;
            this.smallSlot = small;
        }

        public boolean addCar(int carType) {
            switch (carType) {
                case 1:
                    if (bigSlot <= 0) {
                        return false;
                    }
                    bigSlot--;
                    break;
                case 2:
                    if (mediumSlot <= 0) {
                        return false;
                    }
                    mediumSlot--;
                    break;
                case 3:
                    if (smallSlot <= 0) {
                        return false;
                    }
                    smallSlot--;
                    break;
                default:
                    break;
            }
            return true;
        }
    }
}
