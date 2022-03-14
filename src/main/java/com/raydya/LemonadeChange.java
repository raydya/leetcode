package com.raydya;

public class LemonadeChange {

    public boolean lemonadeChange(int[] bills) {
        final int[] cash = new int[3];

        for (final int bill : bills) {
            switch (bill) {
                case 5:
                    cash[0]++;
                    break;
                case 10:
                    cash[1]++;
                    if (cash[0] > 0) {
                        cash[0]--;
                    } else {
                        return false;
                    }
                    break;
                case 20:
                    cash[2]++;
                    if (cash[0] > 0 && cash[1] > 0) {
                        cash[0]--;
                        cash[1]--;
                    } else if (cash[0] >= 3) {
                        cash[0] -= 3;
                    } else {
                        return false;
                    }
                    break;
                default:
                    break;
            }
        }

        return true;
    }
}
