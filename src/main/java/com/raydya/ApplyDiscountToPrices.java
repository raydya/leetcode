package com.raydya;

public class ApplyDiscountToPrices {

    public String discountPrices(String sentence, int discount) {
        final String[] words = sentence.split(" ");
        final StringBuilder sb = new StringBuilder();
        for (String word : words) {
            final String substring = word.substring(1);
            if (word.startsWith("$") && substring.matches("^[0-9]+$")) {
                final String price = word.substring(1);
                final double p = Double.parseDouble(price);
                final double d = p * discount / 100;
                final double np = p - d;
                sb.append("$").append(String.format("%.2f", np));
            } else {
                sb.append(word);
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

}
