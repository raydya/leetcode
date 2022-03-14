package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import java.util.Arrays;
import java.util.Collections;
import org.junit.Assert;
import org.junit.Test;

public class LeafSimilarTreesTest {

    @Test
    public void test1() {
        final TreeNode root1 = TreeNodeUtil.build(
            Arrays.asList(3, 5, 1, 6, 2, 9, 8, null, null, 7, 4));
        final TreeNode root2 = TreeNodeUtil.build(
            Arrays.asList(3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8));

        final LeafSimilarTrees solution = new LeafSimilarTrees();
        final boolean output = solution.leafSimilar(root1, root2);

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final TreeNode root1 = TreeNodeUtil.build(Collections.singletonList(1));
        final TreeNode root2 = TreeNodeUtil.build(Collections.singletonList(1));

        final LeafSimilarTrees solution = new LeafSimilarTrees();
        final boolean output = solution.leafSimilar(root1, root2);

        Assert.assertTrue(output);
    }

    @Test
    public void test3() {
        final TreeNode root1 = TreeNodeUtil.build(Collections.singletonList(1));
        final TreeNode root2 = TreeNodeUtil.build(Collections.singletonList(2));

        final LeafSimilarTrees solution = new LeafSimilarTrees();
        final boolean output = solution.leafSimilar(root1, root2);

        Assert.assertFalse(output);
    }

    @Test
    public void test4() {
        final TreeNode root1 = TreeNodeUtil.build(Arrays.asList(1, 2));
        final TreeNode root2 = TreeNodeUtil.build(Arrays.asList(2, 2));

        final LeafSimilarTrees solution = new LeafSimilarTrees();
        final boolean output = solution.leafSimilar(root1, root2);

        Assert.assertTrue(output);
    }

    @Test
    public void test5() {
        final TreeNode root1 = TreeNodeUtil.build(Arrays.asList(1, 2, 3));
        final TreeNode root2 = TreeNodeUtil.build(Arrays.asList(1, 3, 2));

        final LeafSimilarTrees solution = new LeafSimilarTrees();
        final boolean output = solution.leafSimilar(root1, root2);

        Assert.assertFalse(output);
    }
}
