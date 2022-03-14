package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class SearchInABinarySearchTreeTest {

    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(4, 2, 7, 1, 3));

        final SearchInABinarySearchTree solution = new SearchInABinarySearchTree();
        final TreeNode output = solution.searchBST(root, 2);

        Assert.assertEquals(2, output.val);
        Assert.assertEquals(1, output.left.val);
        Assert.assertEquals(3, output.right.val);
    }

    @Test
    public void test2() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(4, 2, 7, 1, 3));

        final SearchInABinarySearchTree solution = new SearchInABinarySearchTree();
        final TreeNode output = solution.searchBST(root, 5);

        Assert.assertNull(output);
    }
}
