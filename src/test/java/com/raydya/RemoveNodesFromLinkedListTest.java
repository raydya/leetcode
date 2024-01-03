package com.raydya;

import com.raydya.data.type.ListNode;
import com.raydya.utils.ListNodeUtil;
import org.junit.Assert;
import org.junit.Test;

public class RemoveNodesFromLinkedListTest {

    @Test
    public void test1() {
        final ListNode head = ListNodeUtil.build(new int[]{5, 2, 13, 3, 8});

        final RemoveNodesFromLinkedList solution = new RemoveNodesFromLinkedList();
        final ListNode output = solution.removeNodes(head);

        Assert.assertEquals(13, output.val);
        Assert.assertEquals(8, output.next.val);
    }

    @Test
    public void test2() {
        final ListNode head = ListNodeUtil.build(new int[]{1, 1, 1, 1});

        final RemoveNodesFromLinkedList solution = new RemoveNodesFromLinkedList();
        final ListNode output = solution.removeNodes(head);

        Assert.assertEquals(1, output.val);
        Assert.assertEquals(1, output.next.val);
        Assert.assertEquals(1, output.next.next.val);
        Assert.assertEquals(1, output.next.next.next.val);
    }

    @Test
    public void test3() {
        final ListNode head = ListNodeUtil.build(
            new int[]{
                138, 466, 216, 67, 642, 978, 264, 136, 463, 331, 60, 600, 223, 275, 856, 809, 167, 101, 846, 165,
                575, 276, 409, 590, 733, 200, 839, 515, 852, 615, 8, 584, 250, 337, 537, 63, 797, 900, 670, 636, 112,
                701, 334, 422, 780, 552, 912, 506, 313, 474, 183, 792, 822, 661, 37, 164, 601, 271, 902, 792, 501, 184,
                559, 140, 506, 94, 161, 167, 622, 288, 457, 953, 700, 464, 785, 203, 729, 725, 422, 76, 191, 195, 157,
                854, 730, 577, 503, 401, 517, 692, 42, 135, 823, 883, 255, 111, 334, 365, 513, 338, 65, 600, 926, 607,
                193, 763, 366, 674, 145, 229, 700, 11, 984, 36, 185, 475, 204, 604, 191, 898, 876, 762, 654, 770, 774,
                575, 276, 165, 610, 649, 235, 749, 440, 607, 962, 747, 891, 943, 839, 403, 655, 22, 705, 416, 904, 765,
                905, 574, 214, 471, 451, 774, 41, 365, 703, 895, 327, 879, 414, 821, 363, 30, 130, 14, 754, 41, 494,
                548, 76, 825, 899, 499, 188, 982, 8, 890, 563, 438, 363, 32, 482, 623, 864, 161, 962, 678, 414, 659,
                612, 332, 164, 580, 14, 633, 842, 969, 792, 777, 705, 436, 750, 501, 395, 342, 838, 493, 998, 112, 660,
                961, 943, 721, 480, 522, 133, 129, 276, 362, 616, 52, 117, 300, 274, 862, 487, 715, 272, 232, 543, 275,
                68, 144, 656, 623, 317, 63, 908, 565, 880, 12, 920, 467, 559, 91, 698
            });

        final RemoveNodesFromLinkedList solution = new RemoveNodesFromLinkedList();
        final ListNode output = solution.removeNodes(head);

        Assert.assertEquals(998, output.val);
        Assert.assertEquals(961, output.next.val);
        Assert.assertEquals(943, output.next.next.val);
        Assert.assertEquals(920, output.next.next.next.val);
        Assert.assertEquals(698, output.next.next.next.next.val);
    }
}
