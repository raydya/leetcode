package com.raydya;

public class AddStrings {
    public String addStrings(String num1, String num2) {
        int carry = 0;

        StringBuilder ret = new StringBuilder();

        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;

        while (p1 >= 0 || p2 >= 0) {
            final int x1 = p1 >= 0 ? num1.charAt(p1) - '0' : 0;
            final int x2 = p2 >= 0 ? num2.charAt(p2) - '0' : 0;

            final int value = (x1 + x2 + carry) % 10;
            carry = (x1 + x2 + carry) / 10;

            ret.append(value);

            p1--;
            p2--;
        }


        if (carry != 0) ret.append(carry);

        return ret.reverse().toString();
    }
}
