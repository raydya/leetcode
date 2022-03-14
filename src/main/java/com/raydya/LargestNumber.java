package com.raydya;

import java.util.Arrays;

public class LargestNumber {

    public String largestNumber(int[] nums) {
        StringBuilder ret = new StringBuilder();
        Arrays.stream(nums).boxed().sorted((x, y) -> {
            long l = Long.parseLong(x + "" + y);
            long r = Long.parseLong(y + "" + x);
            return r - l <= 0 ? -1 : 1;
        }).forEach(ret::append);

        if (ret.charAt(0) == '0') {
            return "0";
        }

        return ret.toString();
    }
}
