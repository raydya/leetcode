package com.raydya;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class BinaryWatchTest {

    @Test
    public void test1() {
        final BinaryWatch solution = new BinaryWatch();
        final List<String> output = solution.readBinaryWatch(1);

        Assert.assertArrayEquals(
            new String[]{"0:01", "0:02", "0:04", "0:08", "0:16", "0:32", "1:00", "2:00", "4:00",
                "8:00"},
            output.toArray()
        );
    }
}
