package com.raydya;

import com.raydya.data.type.TreeNode;

public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree {

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (cloned == null) {
            return null;
        }
        if (cloned.val == target.val) {
            return cloned;
        }

        final TreeNode t1 = getTargetCopy(original, cloned.left, target);
        if (t1 != null) {
            return t1;
        }
        return getTargetCopy(original, cloned.right, target);
    }

}
