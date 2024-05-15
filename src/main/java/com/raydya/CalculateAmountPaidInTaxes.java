package com.raydya;

public class CalculateAmountPaidInTaxes {

    public double calculateTax(int[][] brackets, int income) {
        double tax = 0.0;
        int previousUpper = 0;

        for (int i = 0; i < brackets.length; i++) {
            int upper = brackets[i][0];
            int percent = brackets[i][1];

            if (income > upper) {
                tax += (upper - previousUpper) * percent / 100.0;
                previousUpper = upper;
            } else {
                tax += (income - previousUpper) * percent / 100.0;
                break;
            }
        }

        return tax;
    }

}
