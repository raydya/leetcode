package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        final ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            final int r3 = i % 3;
            final int r5 = i % 5;
            if (r3 == 0 && r5 == 0) {
                list.add("FizzBuzz");
            } else if (r5 == 0) {
                list.add("Buzz");
            } else if (r3 == 0) {
                list.add("Fizz");
            } else {
                list.add(String.valueOf(i));
            }
        }

        return list;
    }
}
