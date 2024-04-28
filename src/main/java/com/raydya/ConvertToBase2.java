package com.raydya;

public class ConvertToBase2 {

    public String baseNeg2(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append(n & 1);
            n = -(n >> 1);
        }
        return sb.reverse().toString();
    }

}
