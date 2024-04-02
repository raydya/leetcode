package com.raydya;

import com.raydya.data.type.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AllPossibleFullBinaryTreesTest {

    @Test
    public void test1() {
        final AllPossibleFullBinaryTrees solution = new AllPossibleFullBinaryTrees();
        final List<TreeNode> output = solution.allPossibleFBT(7);

        Assert.assertEquals(5, output.size());
    }

    @Test
    public void test2() {
        final AllPossibleFullBinaryTrees solution = new AllPossibleFullBinaryTrees();
        final List<TreeNode> output = solution.allPossibleFBT(3);

        Assert.assertEquals(1, output.size());
    }
}
