package com.raydya;

import com.raydya.data.type.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class AllPossibleFullBinaryTrees {

    private final List<List<TreeNode>> memo = new ArrayList<>();

    public List<TreeNode> allPossibleFBT(int n) {
        if (n % 2 == 0) {
            return new ArrayList<>();
        }
        if (memo.size() > n) {
            return memo.get(n);
        }
        List<TreeNode> ans = new ArrayList<>();
        if (n == 1) {
            ans.add(new TreeNode(0));
        } else {
            for (int i = 1; i < n; i += 2) {
                List<TreeNode> left = allPossibleFBT(i);
                List<TreeNode> right = allPossibleFBT(n - i - 1);
                for (TreeNode l : left) {
                    for (TreeNode r : right) {
                        TreeNode bns = new TreeNode(0);
                        bns.left = l;
                        bns.right = r;
                        ans.add(bns);
                    }
                }
            }
        }
        while (memo.size() <= n) {
            memo.add(null);
        }
        memo.set(n, ans);
        return ans;
    }

}
