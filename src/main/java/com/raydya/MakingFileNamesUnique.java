package com.raydya;

import java.util.HashMap;
import java.util.Map;

public class MakingFileNamesUnique {

    public String[] getFolderNames(String[] names) {
        final String[] ret = new String[names.length];
        final Map<String, Integer> m = new HashMap<>(names.length * 2);
        for (int i = 0; i < names.length; i++) {
            final String name = names[i];
            if (!m.containsKey(name)) {
                m.put(name, 1);
                ret[i] = name;
            } else {
                int k = m.get(name);
                while (m.containsKey(addSuffix(name, k))) {
                    k++;
                }
                ret[i] = addSuffix(name, k);
                m.put(name, k + 1);
                m.put(addSuffix(name, k), 1);
            }
        }
        return ret;
    }

    private String addSuffix(String name, int k) {
        return name + "(" + k + ")";
    }

}
