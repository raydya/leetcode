package com.raydya;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PathCrossing {

    public boolean isPathCrossing(String path) {
        final int l = path.length();
        final int k = l * 2 + 1;
        Map<String, Boolean> visited = new HashMap<>();

        final String[] directions = path.split("");
        int x = k / 2;
        int y = k / 2;
        visited.put(x + "-" + y, true);

        final StringBuilder b = new StringBuilder();
        for (final String direction : directions) {
            switch (direction) {
                case "N":
                    y++;
                    break;
                case "E":
                    x++;
                    break;
                case "S":
                    y--;
                    break;
                case "W":
                    x--;
                    break;
                default:
                    break;
            }
            b.append(x);
            b.append("-");
            b.append(y);
            final String key = b.toString();
            if (Objects.equals(Boolean.TRUE, visited.get(key))) {
                return true;
            }
            visited.put(key, true);
            b.setLength(0);
        }

        return false;
    }
}
