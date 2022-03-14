package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RandomizedSetTest {

    @Test
    public void test1() {
        // 初始化一个空的集合。
        RandomizedSet randomSet = new RandomizedSet();

        // 向集合中插入 1 。返回 true 表示 1 被成功地插入。
        final boolean o1 = randomSet.insert(1);
        Assert.assertTrue(o1);

        // 返回 false ，表示集合中不存在 2 。
        final boolean o2 = randomSet.remove(2);
        Assert.assertFalse(o2);

        // 向集合中插入 2 。返回 true 。集合现在包含 [1,2] 。
        final boolean o3 = randomSet.insert(2);
        Assert.assertTrue(o3);

        // getRandom 应随机返回 1 或 2 。
        randomSet.getRandom();

        // 从集合中移除 1 ，返回 true 。集合现在包含 [2] 。
        randomSet.remove(1);

        // 2 已在集合中，所以返回 false 。
        randomSet.insert(2);

        // 由于 2 是集合中唯一的数字，getRandom 总是返回 2 。
        randomSet.getRandom();
    }
}
