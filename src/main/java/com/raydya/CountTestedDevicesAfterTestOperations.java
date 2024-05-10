package com.raydya;

public class CountTestedDevicesAfterTestOperations {

    public int countTestedDevices(int[] batteryPercentages) {
        int count = 0;
        for (int i = 0; i < batteryPercentages.length; i++) {
            if (batteryPercentages[i] - count > 0) {
                count++;
            }
        }
        return count;
    }

}
