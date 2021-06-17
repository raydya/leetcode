package com.raydya;

public class BaseSeven {
    public String convertToBase7(int num) {
        int quotient = num / 7;
        int remainder = num % 7;
        StringBuilder ret = new StringBuilder(String.valueOf(Math.abs(remainder)));

        while (quotient != 0) {
            remainder = quotient % 7;
            quotient = quotient / 7;
            ret.insert(0, Math.abs(remainder));
        }

        return num < 0 ? "-" + ret : ret.toString();
    }
}
