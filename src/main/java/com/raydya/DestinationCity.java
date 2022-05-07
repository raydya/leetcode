package com.raydya;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class DestinationCity {

    public String destCity(List<List<String>> paths) {
        final Map<String, String> pathMap = paths.stream().collect(
            Collectors.toMap(
                path -> path.get(0),
                path -> path.get(1)
            )
        );

        String currentCity = paths.get(0).get(0);
        String dest = currentCity;
        while (true) {
            final String s = pathMap.get(currentCity);
            if (Objects.isNull(s)) {
                break;
            }
            currentCity = s;
            dest = s;
        }

        return dest;
    }

}
