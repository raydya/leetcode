package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class MinimumDistanceBetweenBSTNodesTest {

    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(4, 2, 6, 1, 3));

        final MinimumDistanceBetweenBSTNodes solution = new MinimumDistanceBetweenBSTNodes();
        final int output = solution.minDiffInBST(root);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(1, 0, 48, null, null, 12, 49));

        final MinimumDistanceBetweenBSTNodes solution = new MinimumDistanceBetweenBSTNodes();
        final int output = solution.minDiffInBST(root);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test3() {
        final TreeNode root = TreeNodeUtil.build(
            Arrays.asList(41, 19, 62, 11, 31, null, 89, 8, 18, null, null, 74, null, null, null,
                16));

        final MinimumDistanceBetweenBSTNodes solution = new MinimumDistanceBetweenBSTNodes();
        final int output = solution.minDiffInBST(root);

        Assert.assertEquals(1, output);
    }
}
