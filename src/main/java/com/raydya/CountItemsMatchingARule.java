package com.raydya;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CountItemsMatchingARule {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        final List<List<String>> filteredItems = items.stream().filter(item -> {
            switch (ruleKey) {
                case "type":
                    return Objects.equals(ruleValue, item.get(0));
                case "color":
                    return Objects.equals(ruleValue, item.get(1));
                case "name":
                    return Objects.equals(ruleValue, item.get(2));
                default:
                    return false;
            }
        }).collect(Collectors.toList());

        return filteredItems.size();
    }

}
