package com.raydya;

import java.util.Arrays;
import java.util.Collections;
import org.junit.Assert;
import org.junit.Test;

public class MaximumDepthOfNAryTreeTest {

    @Test
    public void test1() {
        final MaximumDepthOfNAryTree.Node n5 = new MaximumDepthOfNAryTree.Node(6);
        final MaximumDepthOfNAryTree.Node n4 = new MaximumDepthOfNAryTree.Node(5);
        final MaximumDepthOfNAryTree.Node n3 = new MaximumDepthOfNAryTree.Node(4);
        final MaximumDepthOfNAryTree.Node n2 = new MaximumDepthOfNAryTree.Node(2);
        final MaximumDepthOfNAryTree.Node n1 = new MaximumDepthOfNAryTree.Node(3,
            Arrays.asList(n4, n5));
        final MaximumDepthOfNAryTree.Node root = new MaximumDepthOfNAryTree.Node(1,
            Arrays.asList(n1, n2, n3));

        final MaximumDepthOfNAryTree solution = new MaximumDepthOfNAryTree();
        final int output = solution.maxDepth(root);

        Assert.assertEquals(3, output);
    }


    @Test
    public void test2() {

        final MaximumDepthOfNAryTree.Node n13 = new MaximumDepthOfNAryTree.Node(14);

        final MaximumDepthOfNAryTree.Node n12 = new MaximumDepthOfNAryTree.Node(13);
        final MaximumDepthOfNAryTree.Node n11 = new MaximumDepthOfNAryTree.Node(12);
        final MaximumDepthOfNAryTree.Node n10 = new MaximumDepthOfNAryTree.Node(11,
            Collections.singletonList(n13));

        final MaximumDepthOfNAryTree.Node n9 = new MaximumDepthOfNAryTree.Node(10);
        final MaximumDepthOfNAryTree.Node n8 = new MaximumDepthOfNAryTree.Node(9,
            Collections.singletonList(n12));
        final MaximumDepthOfNAryTree.Node n7 = new MaximumDepthOfNAryTree.Node(8,
            Collections.singletonList(n11));

        final MaximumDepthOfNAryTree.Node n6 = new MaximumDepthOfNAryTree.Node(7,
            Collections.singletonList(n10));
        final MaximumDepthOfNAryTree.Node n5 = new MaximumDepthOfNAryTree.Node(6);

        final MaximumDepthOfNAryTree.Node n4 = new MaximumDepthOfNAryTree.Node(5,
            Arrays.asList(n8, n9));
        final MaximumDepthOfNAryTree.Node n3 = new MaximumDepthOfNAryTree.Node(4,
            Collections.singletonList(n7));
        final MaximumDepthOfNAryTree.Node n2 = new MaximumDepthOfNAryTree.Node(3,
            Arrays.asList(n5, n6));
        final MaximumDepthOfNAryTree.Node n1 = new MaximumDepthOfNAryTree.Node(2);
        final MaximumDepthOfNAryTree.Node root = new MaximumDepthOfNAryTree.Node(1,
            Arrays.asList(n1, n2, n3, n4));

        final MaximumDepthOfNAryTree solution = new MaximumDepthOfNAryTree();
        final int output = solution.maxDepth(root);

        Assert.assertEquals(5, output);
    }
}
