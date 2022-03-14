package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTiltTest {

    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(1, 2, 3));

        final BinaryTreeTilt solution = new BinaryTreeTilt();
        final int output = solution.findTilt(root);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(4, 2, 9, 3, 5, null, 7));

        final BinaryTreeTilt solution = new BinaryTreeTilt();
        final int output = solution.findTilt(root);

        Assert.assertEquals(15, output);
    }

    @Test
    public void test3() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(21, 7, 14, 1, 1, 2, 2, 3, 3));

        final BinaryTreeTilt solution = new BinaryTreeTilt();
        final int output = solution.findTilt(root);

        Assert.assertEquals(9, output);
    }
}
