package com.raydya;

import com.raydya.data.type.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class UniqueBinarySearchTreesIITest {
    @Test
    public void test1() {
        final UniqueBinarySearchTreesII solution = new UniqueBinarySearchTreesII();
        final List<TreeNode> trees = solution.generateTrees(3);

        Assert.assertEquals(5, trees.size());
    }
}
