package com.raydya;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberOfSegmentsInAString {
    public int countSegments(String s) {
        final List<String> strings = Arrays.stream(s.split(" "))
            .filter(s1 -> !"".equals(s1))
            .collect(Collectors.toList());
        return strings.size();
    }
}
