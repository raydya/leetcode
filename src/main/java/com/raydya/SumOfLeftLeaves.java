package com.raydya;

import com.raydya.data.type.TreeNode;

public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        return sum(root, 0);
    }

    public int sum(TreeNode node, int sum) {
        if (node == null) {
            return sum;
        }
        final TreeNode left = node.left;
        final TreeNode right = node.right;
        if (left != null && left.left == null && left.right == null) {
            sum += left.val;
        }
        final int sum1 = sum(left, 0);
        final int sum2 = sum(right, 0);

        return sum + sum1 + sum2;
    }

//    public int sumOfLeftLeaves(TreeNode root) {
//        final List<TreeNode> nodes = getLeftLeaves(root, new ArrayList<>());
//
//        return nodes.stream().map(node -> node.val)
//            .reduce(Integer::sum)
//            .orElse(0);
//    }
//
//    private List<TreeNode> getLeftLeaves(TreeNode node, List<TreeNode> leaves) {
//        if (node == null) return leaves;
//        final TreeNode left = node.left;
//        final TreeNode right = node.right;
//        if (left != null && left.left == null && left.right == null) {
//            leaves.add(left);
//        }
//        final List<TreeNode> leftLeaves = getLeftLeaves(left, new ArrayList<>());
//        final List<TreeNode> rightLeaves = getLeftLeaves(right, new ArrayList<>());
//        leaves.addAll(leftLeaves);
//        leaves.addAll(rightLeaves);
//
//        return leaves;
//    }
}
