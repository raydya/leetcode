package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class SimplifyPath {

    public String simplifyPath(String path) {
        String[] dirs = path.split("/");
        final List<String> list = new ArrayList<>();
        for (String dir : dirs) {
            if (!dir.isEmpty()) {
                if (dir.equals("..")) {
                    if (!list.isEmpty()) {
                        list.remove(list.size() - 1);
                    }
                } else if (!dir.equals(".")) {
                    list.add(dir);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append("/").append(s);
        }
        if (sb.length() == 0) {
            sb.append("/");
        }
        return sb.toString();
    }
}
