package com.raydya;

import com.raydya.data.type.TreeNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<List<Integer>> output = new ArrayList<>();
        backtrace(root, output, 0);
        return output;
    }

    private void backtrace(TreeNode node, List<List<Integer>> output, int level) {
        if (node == null) {
            return;
        }
        if (output.size() <= level) {
            final ArrayList<Integer> list = new ArrayList<>();
            list.add(node.val);
            output.add(list);
        } else {
            final List<Integer> list = output.get(level);
            if (level % 2 == 0) {
                list.add(node.val);
            } else {
                list.add(0, node.val);
            }
        }

        backtrace(node.left, output, level + 1);
        backtrace(node.right, output, level + 1);
    }
}
