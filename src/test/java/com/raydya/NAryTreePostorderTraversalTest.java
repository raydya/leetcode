package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NAryTreePostorderTraversalTest {
    @Test
    public void test1() {
        final NAryTreePostorderTraversal.Node n5 = new NAryTreePostorderTraversal.Node(6);
        final NAryTreePostorderTraversal.Node n4 = new NAryTreePostorderTraversal.Node(5);

        final NAryTreePostorderTraversal.Node n3 = new NAryTreePostorderTraversal.Node(4);
        final NAryTreePostorderTraversal.Node n2 = new NAryTreePostorderTraversal.Node(2);
        final NAryTreePostorderTraversal.Node n1 = new NAryTreePostorderTraversal.Node(3, Arrays.asList(n4, n5));

        final NAryTreePostorderTraversal.Node root = new NAryTreePostorderTraversal.Node(1, Arrays.asList(n1, n2, n3));

        final NAryTreePostorderTraversal solution = new NAryTreePostorderTraversal();
        final List<Integer> output = solution.postorder(root);

        Assert.assertArrayEquals(new Integer[]{5, 6, 3, 2, 4, 1}, output.toArray());
    }

    @Test
    public void test2() {
        final NAryTreePostorderTraversal.Node n13 = new NAryTreePostorderTraversal.Node(14);

        final NAryTreePostorderTraversal.Node n12 = new NAryTreePostorderTraversal.Node(13);
        final NAryTreePostorderTraversal.Node n11 = new NAryTreePostorderTraversal.Node(12);
        final NAryTreePostorderTraversal.Node n10 = new NAryTreePostorderTraversal.Node(11, Collections.singletonList(n13));

        final NAryTreePostorderTraversal.Node n9 = new NAryTreePostorderTraversal.Node(10);
        final NAryTreePostorderTraversal.Node n8 = new NAryTreePostorderTraversal.Node(9, Collections.singletonList(n12));
        final NAryTreePostorderTraversal.Node n7 = new NAryTreePostorderTraversal.Node(8, Collections.singletonList(n11));
        final NAryTreePostorderTraversal.Node n6 = new NAryTreePostorderTraversal.Node(7, Collections.singletonList(n10));
        final NAryTreePostorderTraversal.Node n5 = new NAryTreePostorderTraversal.Node(6);

        final NAryTreePostorderTraversal.Node n4 = new NAryTreePostorderTraversal.Node(5, Arrays.asList(n8, n9));
        final NAryTreePostorderTraversal.Node n3 = new NAryTreePostorderTraversal.Node(4, Collections.singletonList(n7));
        final NAryTreePostorderTraversal.Node n2 = new NAryTreePostorderTraversal.Node(3, Arrays.asList(n5, n6));
        final NAryTreePostorderTraversal.Node n1 = new NAryTreePostorderTraversal.Node(2);

        final NAryTreePostorderTraversal.Node root = new NAryTreePostorderTraversal.Node(
            1, Arrays.asList(n1, n2, n3, n4)
        );

        final NAryTreePostorderTraversal solution = new NAryTreePostorderTraversal();
        final List<Integer> output = solution.postorder(root);

        Assert.assertArrayEquals(new Integer[]{2, 6, 14, 11, 7, 3, 12, 8, 4, 13, 9, 10, 5, 1}, output.toArray());
    }
}
