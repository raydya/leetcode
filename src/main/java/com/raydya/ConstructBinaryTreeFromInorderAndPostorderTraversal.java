package com.raydya;

import com.raydya.data.type.TreeNode;
import java.util.HashMap;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {

    private int index;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        index = postorder.length - 1;
        return build(inorder, postorder, map, 0, postorder.length - 1);
    }

    private TreeNode build(int[] inorder, int[] postorder, HashMap<Integer, Integer> map, int start,
        int end) {
        if (start > end) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[index--]);
        int pos = map.get(root.val);
        root.right = build(inorder, postorder, map, pos + 1, end);
        root.left = build(inorder, postorder, map, start, pos - 1);
        return root;
    }
}
