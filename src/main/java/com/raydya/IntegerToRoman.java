package com.raydya;

public class IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder builder = new StringBuilder();
        final int[] values = {1000, 500, 100, 50, 10, 5, 1};

        int tmp = num;

        for (final int value : values) {
            final int h = tmp / value;
            tmp = tmp % value;

            if (h > 0) {
                final String s = getSymbol(value);
                for (int i = 0; i < h; i++) {
                    builder.append(s);
                }
            }

            if (tmp >= 900) {
                builder.append("CM");
                tmp = tmp % 900;
            } else if (tmp >= 400 && value == 500) {
                builder.append("CD");
                tmp = tmp % 400;
            } else if (tmp >= 90 && value == 100) {
                builder.append("XC");
                tmp = tmp % 90;
            } else if (tmp >= 40 && value == 50) {
                builder.append("XL");
                tmp = tmp % 40;
            } else if (tmp >= 9 && value == 10) {
                builder.append("IX");
                tmp = tmp % 9;
            } else if (tmp >= 4 && value == 5) {
                builder.append("IV");
                tmp = tmp % 4;
            }
        }

        return builder.toString();
    }

    private String getSymbol(int n) {
        switch (n) {
            case 1:
                return "I";
            case 5:
                return "V";
            case 10:
                return "X";
            case 50:
                return "L";
            case 100:
                return "C";
            case 500:
                return "D";
            case 1000:
                return "M";
            default:
                return "";
        }
    }
}
