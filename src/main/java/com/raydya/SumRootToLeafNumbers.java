package com.raydya;

import com.raydya.data.type.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class SumRootToLeafNumbers {

    public int sumNumbers(TreeNode root) {
        final List<String> holder = new ArrayList<>();
        pathSum(root, "", holder);
        return holder.stream()
            .map(Integer::valueOf)
            .reduce(Integer::sum)
            .orElse(0);
    }

    private void pathSum(TreeNode node, String num, List<String> nums) {
        if (node == null) {
            return;
        }
        final String newNum = num + node.val;
        if (node.left == null && node.right == null) {
            nums.add(newNum);
        }
        pathSum(node.left, newNum, nums);
        pathSum(node.right, newNum, nums);
    }
}
