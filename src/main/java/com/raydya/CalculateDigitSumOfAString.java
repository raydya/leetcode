package com.raydya;

public class CalculateDigitSumOfAString {

    public String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i += k) {
                int end = Math.min(i + k, s.length());
                String sub = s.substring(i, end);
                sb.append(sumOfDigits(sub));
            }
            s = sb.toString();
        }
        return s;
    }

    private int sumOfDigits(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += c - '0';
        }
        return sum;
    }
}
