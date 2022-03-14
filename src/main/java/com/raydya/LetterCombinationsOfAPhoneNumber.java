package com.raydya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {

    public List<String> letterCombinations(String digits) {
        if (digits.equals("")) {
            return Collections.emptyList();
        }

        List<List<String>> holder = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            final char c = digits.charAt(i);
            final List<String> letters = getLetters(c);
            holder.add(letters);
        }

        return cartesianProduct(holder);
    }

    private List<String> cartesianProduct(List<List<String>> lists) {
        int solutions = 1;
        for (int i = 0; i < lists.size(); solutions *= lists.get(i).size(), i++)
            ;
        List<String> products = new ArrayList<>();
        for (int i = 0; i < solutions; i++) {
            int j = 1;
            StringBuilder product = new StringBuilder();
            for (List<String> set : lists) {
                final int n = (i / j) % set.size();
                final String s = set.get(n);
                product.append(s);
                j *= set.size();
            }
            products.add(product.toString());
        }

        return products;
    }

    private List<String> getLetters(char num) {
        switch (num) {
            case '2':
                return Arrays.asList("a", "b", "c");
            case '3':
                return Arrays.asList("d", "e", "f");
            case '4':
                return Arrays.asList("g", "h", "i");
            case '5':
                return Arrays.asList("j", "k", "l");
            case '6':
                return Arrays.asList("m", "n", "o");
            case '7':
                return Arrays.asList("p", "q", "r", "s");
            case '8':
                return Arrays.asList("t", "u", "v");
            case '9':
                return Arrays.asList("w", "x", "y", "z");
            default:
                return Collections.emptyList();
        }
    }
}
