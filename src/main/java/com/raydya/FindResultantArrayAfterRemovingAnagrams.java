package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class FindResultantArrayAfterRemovingAnagrams {

    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        if (words == null || words.length == 0) {
            return result;
        }

        // 先添加第一个词
        result.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            String currentWord = words[i];
            String lastWordInResult = result.get(result.size() - 1);

            // 如果当前词与结果中最后一个词不是字母异位词，则添加到结果中
            if (!areAnagrams(currentWord, lastWordInResult)) {
                result.add(currentWord);
            }
        }

        return result;
    }

    // 判断两个字符串是否是字母异位词
    private boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] counts = new int[26]; // 26个英文字母
        for (int i = 0; i < s1.length(); i++) {
            counts[s1.charAt(i) - 'a']++;
            counts[s2.charAt(i) - 'a']--;
        }
        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

}
