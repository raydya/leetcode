package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class BuildAnArrayWithStackOperations {

    public List<String> buildArray(int[] target, int n) {
        final List<String> stack = new ArrayList<>();
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if (i == target[j]) {
                stack.add("Push");
                j++;
            } else {
                stack.add("Push");
                stack.add("Pop");
            }

            if (j > target.length - 1) {
                break;
            }
        }

        return stack;
    }

}
