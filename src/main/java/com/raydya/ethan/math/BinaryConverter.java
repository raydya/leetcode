package com.raydya.ethan.math;

public class BinaryConverter {

    // 32 bit only
    public String toBinary(int decimal) {
        final StringBuilder builder = new StringBuilder();
        while (decimal != 0) {
            builder.append(decimal & 1);
            decimal = decimal >> 1;
        }
        return builder.reverse().toString();
    }

}
