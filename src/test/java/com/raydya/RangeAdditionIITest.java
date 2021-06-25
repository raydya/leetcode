package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RangeAdditionIITest {
    @Test
    public void test1() {
        final RangeAdditionII solution = new RangeAdditionII();
        final int output = solution.maxCount(3, 3, new int[][]{{2, 2,}, {3, 3}});

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final RangeAdditionII solution = new RangeAdditionII();
        final int output = solution.maxCount(3, 3, new int[][]{});

        Assert.assertEquals(9, output);
    }

    @Test
    public void test3() {
        final RangeAdditionII solution = new RangeAdditionII();
        final int output = solution.maxCount(18, 3, new int[][]{
            {16, 1}, {14, 3}, {14, 2}, {4, 1}, {10, 1}, {11, 1}, {8, 3}, {16, 2}, {13, 1}, {8, 3}, {2, 2}, {9, 1}, {3, 1}, {2, 2}, {6, 3}
        });

        Assert.assertEquals(2, output);
    }

    @Test
    public void test4() {
        final RangeAdditionII solution = new RangeAdditionII();
        final int output = solution.maxCount(39999, 39999, new int[][]{{19999, 19999}});

        Assert.assertEquals(399960001, output);
    }

    @Test
    public void test5() {
        final RangeAdditionII solution = new RangeAdditionII();
        final int output = solution.maxCount(26797, 12287, new int[][]{{18717, 11856}, {3154, 2135}, {561, 10977}, {14679, 3527}, {17166, 1028}, {20980, 3893}, {13125, 7906}, {23463, 6555}, {8173, 2966}, {18316, 12040}, {22715, 6802}, {13774, 6466}, {22370, 4428}, {23389, 8396}, {1436, 8292}, {26525, 8913}, {19736, 9021}, {6483, 4026}});

        Assert.assertEquals(576708, output);
    }
}
