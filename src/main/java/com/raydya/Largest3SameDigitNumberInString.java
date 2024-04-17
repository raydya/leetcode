package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class Largest3SameDigitNumberInString {

    public String largestGoodInteger(String num) {
        final List<String> targets = new ArrayList<>();
        targets.add("999");
        targets.add("888");
        targets.add("777");
        targets.add("666");
        targets.add("555");
        targets.add("444");
        targets.add("333");
        targets.add("222");
        targets.add("111");
        targets.add("000");

        for (final String target : targets) {
            if (num.contains(target)) {
                return target;
            }
        }

        return "";
    }

}
