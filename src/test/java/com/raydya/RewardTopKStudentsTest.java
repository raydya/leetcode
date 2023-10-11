package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class RewardTopKStudentsTest {

    @Test
    public void test1() {
        final RewardTopKStudents solution = new RewardTopKStudents();
        final List<Integer> output = solution.topStudents(
            new String[]{"smart", "brilliant", "studious"},
            new String[]{"not"},
            new String[]{"this student is studious", "the student is smart"},
            new int[]{1, 2},
            2
        );

        Assert.assertArrayEquals(new Integer[]{1, 2}, output.toArray());
    }

    @Test
    public void test2() {
        final RewardTopKStudents solution = new RewardTopKStudents();
        final List<Integer> output = solution.topStudents(
            new String[]{"smart", "brilliant", "studious"},
            new String[]{"not"},
            new String[]{"this student is not studious", "the student is smart"},
            new int[]{1, 2},
            2
        );

        Assert.assertArrayEquals(new Integer[]{2, 1}, output.toArray());
    }

    @Test
    public void test3() {
        final RewardTopKStudents solution = new RewardTopKStudents();
        final List<Integer> output = solution.topStudents(
            new String[]{"fkeofjpc", "qq", "iio"},
            new String[]{"jdh", "khj", "eget", "rjstbhe", "yzyoatfyx", "wlinrrgcm"},
            new String[]{"rjstbhe eget kctxcoub urrmkhlmi yniqafy fkeofjpc iio yzyoatfyx khj iio",
                "gpnhgabl qq qq fkeofjpc dflidshdb qq iio khj qq yzyoatfyx",
                "tizpzhlbyb eget z rjstbhe iio jdh jdh iptxh qq rjstbhe",
                "jtlghe wlinrrgcm jnkdbd k iio et rjstbhe iio qq jdh",
                "yp fkeofjpc lkhypcebox rjstbhe ewwykishv egzhne jdh y qq qq",
                "fu ql iio fkeofjpc jdh luspuy yzyoatfyx li qq v", "wlinrrgcm iio qq omnc sgkt tzgev iio iio qq qq",
                "d vhg qlj khj wlinrrgcm qq f jp zsmhkjokmb rjstbhe"},
            new int[]{96537918, 589204657, 765963609, 613766496, 43871615, 189209587, 239084671, 908938263},
            3
        );

        Assert.assertArrayEquals(new Integer[]{239084671, 589204657, 43871615}, output.toArray());
    }
}
