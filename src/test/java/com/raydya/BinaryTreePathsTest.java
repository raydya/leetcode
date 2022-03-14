package com.raydya;

import com.raydya.data.type.TreeNode;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class BinaryTreePathsTest {

    @Test
    public void test1() {
        final TreeNode n3 = new TreeNode(5);

        final TreeNode n2 = new TreeNode(3);
        final TreeNode n1 = new TreeNode(2, null, n3);

        final TreeNode root = new TreeNode(1, n1, n2);

        final BinaryTreePaths solution = new BinaryTreePaths();
        final List<String> binaryTreePaths = solution.binaryTreePaths(root);

        Assert.assertEquals("1->2->5", binaryTreePaths.get(0));
        Assert.assertEquals("1->3", binaryTreePaths.get(1));
    }
}
