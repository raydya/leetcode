package com.raydya;

import java.util.Arrays;

public class UOAnQW {

    public int maximumScore(int[] cards, int cnt) {
        // 将卡片按数字从大到小排序
        Arrays.sort(cards);
        reverse(cards);

        int sum = 0;
        int oddCount = 0;
        int lastOdd = -1, lastEven = -1;

        // 选择前cnt张卡片
        for (int i = 0; i < cnt; i++) {
            sum += cards[i];
            if (cards[i] % 2 != 0) {
                oddCount++;
                lastOdd = i;
            } else {
                lastEven = i;
            }
        }

        // 如果和已经是偶数，直接返回
        if (sum % 2 == 0) {
            return sum;
        }

        // 如果和是奇数，需要调整
        int result = 0;

        // 尝试替换一个奇数
        if (lastOdd >= 0 && cnt < cards.length) {
            for (int i = cnt; i < cards.length; i++) {
                if (cards[i] % 2 == 0) {
                    result = Math.max(result, sum - cards[lastOdd] + cards[i]);
                    break;
                }
            }
        }

        // 尝试替换一个偶数
        if (lastEven >= 0 && cnt < cards.length) {
            for (int i = cnt; i < cards.length; i++) {
                if (cards[i] % 2 != 0) {
                    result = Math.max(result, sum - cards[lastEven] + cards[i]);
                    break;
                }
            }
        }

        return result;
    }

    // 辅助方法：反转数组
    private void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
