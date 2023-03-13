package com.raydya;

public class MinimumHoursOfTrainingToWinACompetition {

    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        final int n = energy.length;
        int sEgy = 0;
        int cEgy = initialEnergy;
        int sExp = 0;
        int cExp = initialExperience;
        for (int i = 0; i < n; i++) {
            final int egy = energy[i];
            final int exp = experience[i];
            if (egy >= cEgy) {
                sEgy += egy - cEgy + 1;
                cEgy = 1;
            } else {
                cEgy -= egy;
            }
            if (exp >= cExp) {
                final int d = exp - cExp + 1;
                sExp += d;
                cExp += exp + d;
            } else {
                cExp += exp;
            }
        }

        return sEgy + sExp;
    }

}
