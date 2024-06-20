package com.raydya;

public class NumberOfBeautifulPairs {

    private static final int[][] gcdTable = new int[10][10];

    public int countBeautifulPairs(int[] nums) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                gcdTable[i][j] = gcd(i, j);
            }
        }

        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                final int a = nums[i];
                final int b = nums[j];

                int m = a;
                while (m >= 10) {
                    m = m / 10;
                }
                int n = b;
                while (n >= 10) {
                    n = n % 10;
                }
                final boolean coprime = isCoprime(m, n);
                if (coprime) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

    // 判断是否互质 (查表)
    private static boolean isCoprime(int a, int b) {
        return gcdTable[a][b] == 1;
    }

    // 辗转相除法计算最大公约数 (仅用于初始化 gcdTable)
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


}
