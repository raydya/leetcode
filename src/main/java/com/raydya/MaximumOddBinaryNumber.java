package com.raydya;

public class MaximumOddBinaryNumber {

    public String maximumOddBinaryNumber(String s) {
        int ones = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ones++;
            }
        }

        int zeros = s.length() - ones;
        StringBuilder sb = new StringBuilder();
        sb.append("1");
        ones--;

        while (zeros > 0) {
            sb.insert(0, "0");
            zeros--;
        }

        while (ones > 0) {
            sb.insert(0, "1");
            ones--;
        }
        return sb.toString();
    }

}
