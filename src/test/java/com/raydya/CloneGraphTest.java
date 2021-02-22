package com.raydya;

import com.raydya.data.type.GraphNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class CloneGraphTest {
    @Test
    public void test1() {
        final GraphNode n1 = new GraphNode(1);
        final GraphNode n2 = new GraphNode(2);
        final GraphNode n3 = new GraphNode(3);
        final GraphNode n4 = new GraphNode(4);
        n1.neighbors = Arrays.asList(n2, n4);
        n2.neighbors = Arrays.asList(n1, n3);
        n3.neighbors = Arrays.asList(n2, n4);
        n4.neighbors = Arrays.asList(n1, n3);

        final CloneGraph solution = new CloneGraph();
        final GraphNode clone = solution.cloneGraph(n1);

        Assert.assertEquals(1, clone.val);
        Assert.assertArrayEquals(
            new Integer[]{2, 4},
            clone.neighbors.stream()
                .map(graphNode -> graphNode.val)
                .toArray()
        );

        final GraphNode cn2 = clone.neighbors.get(0);
        Assert.assertEquals(2, cn2.val);
        Assert.assertArrayEquals(
            new Integer[]{1, 3},
            cn2.neighbors.stream()
                .map(graphNode -> graphNode.val)
                .toArray()
        );

        final GraphNode cn4 = clone.neighbors.get(1);
        Assert.assertEquals(4, cn4.val);
        Assert.assertArrayEquals(
            new Integer[]{1, 3},
            cn4.neighbors.stream()
                .map(graphNode -> graphNode.val)
                .toArray()
        );

        final GraphNode cn3 = cn2.neighbors.get(1);
        Assert.assertEquals(3, cn3.val);
        Assert.assertArrayEquals(
            new Integer[]{2, 4},
            cn3.neighbors.stream()
                .map(graphNode -> graphNode.val)
                .toArray()
        );
    }
}
