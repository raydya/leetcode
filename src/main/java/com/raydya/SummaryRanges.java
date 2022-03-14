package com.raydya;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return Collections.emptyList();
        }

        int pre = nums[0];
        int start = nums[0];

        final List<String> ranges = new ArrayList<>();

        for (int i = 1; i < nums.length; i++) {
            final int num = nums[i];

            if (num - pre != 1) {
                if (start == pre) {
                    ranges.add(String.valueOf(start));
                } else {
                    ranges.add(start + "->" + pre);
                }
                start = num;
            }
            pre = num;
        }

        if (start == pre) {
            ranges.add(String.valueOf(start));
        } else {
            ranges.add(start + "->" + pre);
        }

        return ranges;
    }
}
