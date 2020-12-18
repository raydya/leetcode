package com.raydya;

public class SimplifyPath {
    public String simplifyPath(String path) {
        final String[] strings = path.split("/");

        int c = 0;
        StringBuilder ret = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            final String s = strings[i];
            if ("..".equals(s)) {
                c++;
            } else if (".".equals(s) || "".equals(s)) {
                // do nothing
            } else {
                if (c > 0) {
                    c--;
                } else {
                    ret.insert(0, "/" + s);
                }
            }
        }

        return ret.toString().equals("") ? "/" : ret.toString();
    }
}
