package com.raydya;

import com.raydya.data.type.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class AverageOfLevelsInBinaryTree {

    public List<Double> averageOfLevels(TreeNode root) {
        final List<Double> ret = new ArrayList<>();
        ret.add((double) root.val);

        List<TreeNode> nodes = new ArrayList<>();
        if (root.left != null) {
            nodes.add(root.left);
        }
        if (root.right != null) {
            nodes.add(root.right);
        }

        while (!nodes.isEmpty()) {
            long sum = 0;
            List<TreeNode> newNodes = new ArrayList<>();
            for (final TreeNode node : nodes) {
                sum += node.val;
                if (node.left != null) {
                    newNodes.add(node.left);
                }
                if (node.right != null) {
                    newNodes.add(node.right);
                }
            }
            ret.add(sum / (double) nodes.size());
            nodes = newNodes;
        }

        return ret;
    }
}
