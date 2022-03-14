package com.raydya;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopKFrequentWords {

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();

        for (final String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        return map.entrySet().stream().map(entry -> {
                final String key = entry.getKey();
                final Integer value = entry.getValue();
                final Word word = new Word();
                word.word = key;
                word.count = value;
                return word;
            })
            .sorted(
                Comparator.comparing(
                    Word::getCount,
                    Comparator.reverseOrder()
                ).thenComparing(
                    Word::getWord,
                    Comparator.naturalOrder()
                )
            )
            .limit(k)
            .map(Word::getWord)
            .collect(Collectors.toList());
    }

    public static class Word {

        public String word;
        public int count;

        public String getWord() {
            return word;
        }

        public int getCount() {
            return count;
        }
    }
}
