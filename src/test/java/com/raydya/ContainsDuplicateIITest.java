package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicateIITest {
    @Test
    public void test1() {
        final ContainsDuplicateII solution = new ContainsDuplicateII();
        final boolean duplicate = solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3);

        Assert.assertTrue(duplicate);
    }

    @Test
    public void test2() {
        final ContainsDuplicateII solution = new ContainsDuplicateII();
        final boolean duplicate = solution.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1);

        Assert.assertTrue(duplicate);
    }

    @Test
    public void test3() {
        final ContainsDuplicateII solution = new ContainsDuplicateII();
        final boolean duplicate = solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2);

        Assert.assertFalse(duplicate);
    }

    @Test
    public void test4() {
        final ContainsDuplicateII solution = new ContainsDuplicateII();
        final boolean duplicate = solution.containsNearbyDuplicate(new int[]{1, 2, 1}, 0);

        Assert.assertFalse(duplicate);
    }

    @Test
    public void test5() {
        final ContainsDuplicateII solution = new ContainsDuplicateII();
        final boolean duplicate = solution.containsNearbyDuplicate(new int[]{4, 1, 2, 3, 1, 5}, 3);

        Assert.assertTrue(duplicate);
    }

    @Test
    public void test6() {
        final ContainsDuplicateII solution = new ContainsDuplicateII();
        final boolean duplicate = solution.containsNearbyDuplicate(new int[]{0, 1, 2, 3, 4, 5, 0}, 5);

        Assert.assertFalse(duplicate);
    }
}
