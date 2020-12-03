package com.raydya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();

        final HashMap<String, List<String>> holder = new HashMap<>();
        for (final String str : strs) {
            final char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            final String s = Arrays.toString(charArray);

            if (!holder.containsKey(s)) {
                holder.put(s, new ArrayList<>());
            }
            holder.get(s).add(str);
        }

        return new ArrayList<>(holder.values());
    }
}
