package com.raydya;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class NAryTreePreorderTraversalTest {

    @Test
    public void test1() {
        final NAryTreePreorderTraversal.Node n5 = new NAryTreePreorderTraversal.Node(6);
        final NAryTreePreorderTraversal.Node n4 = new NAryTreePreorderTraversal.Node(5);

        final NAryTreePreorderTraversal.Node n3 = new NAryTreePreorderTraversal.Node(4);
        final NAryTreePreorderTraversal.Node n2 = new NAryTreePreorderTraversal.Node(2);
        final NAryTreePreorderTraversal.Node n1 = new NAryTreePreorderTraversal.Node(3,
            Arrays.asList(n4, n5));

        final NAryTreePreorderTraversal.Node root = new NAryTreePreorderTraversal.Node(1,
            Arrays.asList(n1, n2, n3));

        final NAryTreePreorderTraversal solution = new NAryTreePreorderTraversal();
        final List<Integer> output = solution.preorder(root);

        Assert.assertArrayEquals(new Integer[]{1, 3, 5, 6, 2, 4}, output.toArray());
    }

    @Test
    public void test2() {
        final NAryTreePreorderTraversal.Node n13 = new NAryTreePreorderTraversal.Node(14);

        final NAryTreePreorderTraversal.Node n12 = new NAryTreePreorderTraversal.Node(13);
        final NAryTreePreorderTraversal.Node n11 = new NAryTreePreorderTraversal.Node(12);
        final NAryTreePreorderTraversal.Node n10 = new NAryTreePreorderTraversal.Node(11,
            Collections.singletonList(n13));

        final NAryTreePreorderTraversal.Node n9 = new NAryTreePreorderTraversal.Node(10);
        final NAryTreePreorderTraversal.Node n8 = new NAryTreePreorderTraversal.Node(9,
            Collections.singletonList(n12));
        final NAryTreePreorderTraversal.Node n7 = new NAryTreePreorderTraversal.Node(8,
            Collections.singletonList(n11));
        final NAryTreePreorderTraversal.Node n6 = new NAryTreePreorderTraversal.Node(7,
            Collections.singletonList(n10));
        final NAryTreePreorderTraversal.Node n5 = new NAryTreePreorderTraversal.Node(6);

        final NAryTreePreorderTraversal.Node n4 = new NAryTreePreorderTraversal.Node(5,
            Arrays.asList(n8, n9));
        final NAryTreePreorderTraversal.Node n3 = new NAryTreePreorderTraversal.Node(4,
            Collections.singletonList(n7));
        final NAryTreePreorderTraversal.Node n2 = new NAryTreePreorderTraversal.Node(3,
            Arrays.asList(n5, n6));
        final NAryTreePreorderTraversal.Node n1 = new NAryTreePreorderTraversal.Node(2);

        final NAryTreePreorderTraversal.Node root = new NAryTreePreorderTraversal.Node(
            1, Arrays.asList(n1, n2, n3, n4)
        );

        final NAryTreePreorderTraversal solution = new NAryTreePreorderTraversal();
        final List<Integer> output = solution.preorder(root);

        Assert.assertArrayEquals(new Integer[]{1, 2, 3, 6, 7, 11, 14, 4, 8, 12, 5, 9, 13, 10},
            output.toArray());
    }
}
