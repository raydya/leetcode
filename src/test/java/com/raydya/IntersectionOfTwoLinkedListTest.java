package com.raydya;

import com.raydya.data.type.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class IntersectionOfTwoLinkedListTest {

    @Test
    public void test1() {
        final ListNode c3 = new ListNode(5);
        final ListNode c2 = new ListNode(4, c3);
        final ListNode c1 = new ListNode(8, c2);

        final ListNode a2 = new ListNode(1, c1);
        final ListNode a1 = new ListNode(4, a2);

        final ListNode b3 = new ListNode(1, c1);
        final ListNode b2 = new ListNode(6, b3);
        final ListNode b1 = new ListNode(5, b2);

        final IntersectionOfTwoLinkedList solution = new IntersectionOfTwoLinkedList();
        final ListNode intersectionNode = solution.getIntersectionNode(a1, b1);

        Assert.assertEquals(c1, intersectionNode);
    }

    @Test
    public void test2() {
        final ListNode c2 = new ListNode(4);
        final ListNode c1 = new ListNode(2, c2);

        final ListNode a3 = new ListNode(1, c1);
        final ListNode a2 = new ListNode(9, a3);
        final ListNode a1 = new ListNode(1, a2);

        final ListNode b1 = new ListNode(3, c1);

        final IntersectionOfTwoLinkedList solution = new IntersectionOfTwoLinkedList();
        final ListNode intersectionNode = solution.getIntersectionNode(a1, b1);

        Assert.assertEquals(c1, intersectionNode);
    }

    @Test
    public void test3() {
        final ListNode a3 = new ListNode(4);
        final ListNode a2 = new ListNode(6, a3);
        final ListNode a1 = new ListNode(2, a2);

        final ListNode b2 = new ListNode(5);
        final ListNode b1 = new ListNode(1, b2);

        final IntersectionOfTwoLinkedList solution = new IntersectionOfTwoLinkedList();
        final ListNode intersectionNode = solution.getIntersectionNode(a1, b1);

        Assert.assertNull(intersectionNode);
    }

    @Test
    public void test4() {
        final ListNode c1 = new ListNode(1);

        final IntersectionOfTwoLinkedList solution = new IntersectionOfTwoLinkedList();
        final ListNode intersectionNode = solution.getIntersectionNode(c1, c1);

        Assert.assertEquals(c1, intersectionNode);
    }

    @Test
    public void test5() {
        final ListNode a1 = new ListNode(3);
        final ListNode b1 = new ListNode(2, a1);

        final IntersectionOfTwoLinkedList solution = new IntersectionOfTwoLinkedList();
        final ListNode intersectionNode = solution.getIntersectionNode(a1, b1);

        Assert.assertEquals(a1, intersectionNode);
    }

    @Test
    public void test6() {
        final ListNode a1 = new ListNode(1);

        final IntersectionOfTwoLinkedList solution = new IntersectionOfTwoLinkedList();
        final ListNode intersectionNode = solution.getIntersectionNode(a1, null);

        Assert.assertNull(intersectionNode);
    }
}
