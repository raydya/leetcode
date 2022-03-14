package com.raydya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }

        final HashMap<String, List<String>> holder = new HashMap<>();
        for (final String str : strs) {
            final char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            final String s = new String(charArray);

            if (holder.containsKey(s)) {
                holder.get(s).add(str);
            } else {
                final List<String> list = new ArrayList<>();
                list.add(str);
                holder.put(s, list);
            }
        }

        return new ArrayList<>(holder.values());
    }
}
