package com.raydya;

import com.raydya.DesignAnOrderedStream.OrderedStream;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DesignAnOrderedStreamTest {

    @Test
    public void test1() {
        final OrderedStream solution = new DesignAnOrderedStream.OrderedStream(5);

        final List<String> output1 = solution.insert(3, "ccccc");
        Assert.assertArrayEquals(new String[]{}, output1.toArray());

        final List<String> output2 = solution.insert(1, "aaaaa");
        Assert.assertArrayEquals(new String[]{"aaaaa"}, output2.toArray());

        final List<String> output3 = solution.insert(2, "bbbbb");
        Assert.assertArrayEquals(new String[]{"bbbbb", "ccccc"}, output3.toArray());

        final List<String> output4 = solution.insert(5, "eeeee");
        Assert.assertArrayEquals(new String[]{}, output4.toArray());

        final List<String> output5 = solution.insert(4, "ddddd");
        Assert.assertArrayEquals(new String[]{"ddddd", "eeeee"}, output5.toArray());
    }

}
