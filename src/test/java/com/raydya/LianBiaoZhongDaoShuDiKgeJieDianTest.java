package com.raydya;

import com.raydya.data.type.ListNode;
import com.raydya.utils.ListNodeUtil;
import org.junit.Assert;
import org.junit.Test;

public class LianBiaoZhongDaoShuDiKgeJieDianTest {
    @Test
    public void test1() {
        final ListNode head = ListNodeUtil.build(new int[]{1, 2, 3, 4, 5});

        final LianBiaoZhongDaoShuDiKgeJieDian solution = new LianBiaoZhongDaoShuDiKgeJieDian();
        final ListNode output = solution.getKthFromEnd(head, 2);

        Assert.assertEquals(4, output.val);
        Assert.assertEquals(5, output.next.val);
        Assert.assertNull(output.next.next);
    }
}
