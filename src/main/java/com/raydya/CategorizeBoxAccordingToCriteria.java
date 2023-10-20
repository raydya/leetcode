package com.raydya;

public class CategorizeBoxAccordingToCriteria {

    public String categorizeBox(int length, int width, int height, int mass) {
        final long volume = (long) length * width * height;
        final boolean isBulky = length >= 10000 || width >= 10000 || height >= 10000 || volume >= 1000000000;
        final boolean isHeavy = mass >= 100;

        if (isBulky && isHeavy) {
            return "Both";
        } else if (isBulky) {
            return "Bulky";
        } else if (isHeavy) {
            return "Heavy";
        }
        return "Neither";
    }

}
