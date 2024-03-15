package com.raydya;

import com.raydya.data.type.TreeNode;

public class RootEqualsSumOfChildren {

    public boolean checkTree(TreeNode root) {
        return root.val == (root.left.val + root.right.val);
    }

}
