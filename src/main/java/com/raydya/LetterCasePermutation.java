package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

    public List<String> letterCasePermutation(String s) {
        char[] str = s.toCharArray();
        List<String> list = new ArrayList<>();
        process(str, 0, list);
        return list;
    }

    // 递归函数的参数表示为，字符数组str，从index位置出发，对每个index位置的字符，
    // 如果index位置的字符是数字，则正常向下传递，如果为字母考虑变不变大小写
    public void process(char[] str, int index, List<String> list) {
        if (index == str.length) {// 用来搂底，index来到终点，获取字符串
            list.add(String.valueOf(str));
            return;
        }
        if (str[index] > '9' || str[index] < '0') { // 如果为字母
            process(str, index + 1, list); // 不改变大小写，继续传递
            changeFormat(str, index); // 改变大小写，大写变小写，小写变大写
            process(str, index + 1, list); // 改变后继续传递
        } else {  // 如果是数字。什么都不变。继续传递
            process(str, index + 1, list);
        }
    }

    public void changeFormat(char[] str, int index) {
        if (str[index] >= 'A' && str[index] <= 'Z') {
            str[index] = (char) (str[index] - 'A' + 'a');
        } else if (str[index] >= 'a' && str[index] <= 'z') {
            str[index] = (char) (str[index] - 'a' + 'A');
        }
    }
}
