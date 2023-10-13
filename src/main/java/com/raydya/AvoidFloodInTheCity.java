package com.raydya;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class AvoidFloodInTheCity {

    public int[] avoidFlood(int[] rains) {
        final int[] ans = new int[rains.length];
        Arrays.fill(ans, 1);
        final TreeSet<Integer> st = new TreeSet<>();
        final Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < rains.length; ++i) {
            if (rains[i] == 0) {
                st.add(i);
            } else {
                ans[i] = -1;
                if (mp.containsKey(rains[i])) {
                    Integer it = st.ceiling(mp.get(rains[i]));
                    if (it == null) {
                        return new int[0];
                    }
                    ans[it] = rains[i];
                    st.remove(it);
                }
                mp.put(rains[i], i);
            }
        }
        return ans;
    }

}
