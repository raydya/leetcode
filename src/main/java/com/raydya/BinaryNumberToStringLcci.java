package com.raydya;

public class BinaryNumberToStringLcci {


    //6 * 10 ^ -1 + 2 * 10^-2 + 5 * 10^-3
    // 1 * 2^-1 + 0 * 2^-2 + 1*2^-3
    public String printBin(double num) {
        final double m = num * Math.pow(2.0, 6);
        final double v = m - (int) m;
        if (v != 0) {
            return "ERROR";
        }
        StringBuilder r = new StringBuilder();
        r.append("0.");
        double f = num - (int) num;
        while (f != 0.0) {
            num = num * 2;
            final int l = (int) num % 2;
            f = num - (int) num;
            r.append(l);
        }

        return r.toString();
    }

}
