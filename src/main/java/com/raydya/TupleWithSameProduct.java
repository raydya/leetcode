package com.raydya;

import java.util.HashMap;
import java.util.Map;

public class TupleWithSameProduct {

    public int tupleSameProduct(int[] nums) {
        final Map<Integer, Integer> holder = new HashMap();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            final int a = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                final int b = nums[j];
                final int product = a * b;
                if (holder.containsKey(product)) {
                    count += 8 * holder.get(product);
                }
                holder.put(product, holder.getOrDefault(product, 0) + 1);
            }
        }
        return count;
    }

}
