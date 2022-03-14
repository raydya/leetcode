package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class ConstructStringFromBinaryTreeTest {

    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(1, 2, 3, 4));

        final ConstructStringFromBinaryTree solution = new ConstructStringFromBinaryTree();
        final String output = solution.tree2str(root);

        Assert.assertEquals("1(2(4))(3)", output);
    }

    @Test
    public void test2() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(1, 2, 3, null, 4));

        final ConstructStringFromBinaryTree solution = new ConstructStringFromBinaryTree();
        final String output = solution.tree2str(root);

        Assert.assertEquals("1(2()(4))(3)", output);
    }
}
