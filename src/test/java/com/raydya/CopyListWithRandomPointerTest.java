package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CopyListWithRandomPointerTest {

    @Test
    public void test1() {
        final CopyListWithRandomPointer.Node n4 = new CopyListWithRandomPointer.Node(1);
        final CopyListWithRandomPointer.Node n3 = new CopyListWithRandomPointer.Node(10);
        final CopyListWithRandomPointer.Node n2 = new CopyListWithRandomPointer.Node(11);
        final CopyListWithRandomPointer.Node n1 = new CopyListWithRandomPointer.Node(13);
        final CopyListWithRandomPointer.Node head = new CopyListWithRandomPointer.Node(7);

        head.next = n1;
        head.random = null;
        n1.next = n2;
        n1.random = head;
        n2.next = n3;
        n2.random = n4;
        n3.next = n4;
        n3.random = n2;
        n4.next = null;
        n4.random = head;

        final CopyListWithRandomPointer solution = new CopyListWithRandomPointer();
        final CopyListWithRandomPointer.Node output = solution.copyRandomList(head);

        Assert.assertNotEquals(head, output);
        Assert.assertEquals(7, output.val);
        Assert.assertEquals(13, output.next.val);
        Assert.assertEquals(11, output.next.next.val);
        Assert.assertEquals(10, output.next.next.next.val);
        Assert.assertEquals(1, output.next.next.next.next.val);
        Assert.assertNull(output.next.next.next.next.next);
        Assert.assertNull(output.random);
        Assert.assertEquals(output, output.next.random);
        Assert.assertEquals(output.next.next.next.next, output.next.next.random);
        Assert.assertEquals(output.next.next, output.next.next.next.random);
        Assert.assertEquals(output, output.next.next.next.next.random);
    }

    @Test
    public void test2() {
        final CopyListWithRandomPointer.Node n1 = new CopyListWithRandomPointer.Node(2);
        final CopyListWithRandomPointer.Node head = new CopyListWithRandomPointer.Node(1);

        head.next = n1;
        head.random = n1;
        n1.next = null;
        n1.random = n1;

        final CopyListWithRandomPointer solution = new CopyListWithRandomPointer();
        final CopyListWithRandomPointer.Node output = solution.copyRandomList(head);

        Assert.assertNotEquals(head, output);
        Assert.assertEquals(1, output.val);
        Assert.assertEquals(2, output.next.val);
        Assert.assertNull(output.next.next);
        Assert.assertEquals(output.next, output.random);
        Assert.assertEquals(output.next, output.next.random);
    }

    @Test
    public void test3() {
        final CopyListWithRandomPointer.Node n2 = new CopyListWithRandomPointer.Node(3);
        final CopyListWithRandomPointer.Node n1 = new CopyListWithRandomPointer.Node(3);
        final CopyListWithRandomPointer.Node head = new CopyListWithRandomPointer.Node(3);

        head.next = n1;
        head.random = null;
        n1.next = n2;
        n1.random = head;
        n2.next = null;
        n2.random = null;

        final CopyListWithRandomPointer solution = new CopyListWithRandomPointer();
        final CopyListWithRandomPointer.Node output = solution.copyRandomList(head);

        Assert.assertNotEquals(head, output);

        Assert.assertEquals(3, output.val);
        Assert.assertEquals(3, output.next.val);
        Assert.assertEquals(3, output.next.next.val);
        Assert.assertNull(output.next.next.next);
        Assert.assertNull(output.random);
        Assert.assertEquals(output, output.next.random);
        Assert.assertNull(output.next.next.random);
    }
}
