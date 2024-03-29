package com.raydya;

import com.raydya.data.type.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class PathSumII {

    private List<List<Integer>> resultList = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return resultList;
        }
        List<Integer> path = new ArrayList<>();
        pathSumInner(root, targetSum, path);
        return resultList;
    }

    public void pathSumInner(TreeNode root, int sum, List<Integer> path) {
        path.add(root.val);
        if (root.left == null && root.right == null && sum == root.val) {
            resultList.add(new ArrayList<>(path));
        }
        if (root.left != null) {
            pathSumInner(root.left, sum - root.val, path);
        }
        if (root.right != null) {
            pathSumInner(root.right, sum - root.val, path);
        }
        path.remove(path.size() - 1);
    }
}
