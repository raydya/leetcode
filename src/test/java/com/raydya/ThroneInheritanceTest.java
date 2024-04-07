package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ThroneInheritanceTest {

    @Test
    public void test1() {
        final ThroneInheritance t = new ThroneInheritance("king");
        t.birth("king", "andy"); // 继承顺序：king > andy
        t.birth("king", "bob"); // 继承顺序：king > andy > bob
        t.birth("king", "catherine"); // 继承顺序：king > andy > bob > catherine
        t.birth("andy", "matthew"); // 继承顺序：king > andy > matthew > bob > catherine
        t.birth("bob", "alex"); // 继承顺序：king > andy > matthew > bob > alex > catherine
        t.birth("bob", "asha"); // 继承顺序：king > andy > matthew > bob > alex > asha > catherine

        final List<String> o1 = t.getInheritanceOrder();// 返回 ["king", "andy", "matthew", "bob", "alex", "asha", "catherine"]
        Assert.assertArrayEquals(new String[]{"king", "andy", "matthew", "bob", "alex", "asha", "catherine"},
            o1.toArray());

        t.death("bob"); // 继承顺序：king > andy > matthew > bob（已经去世）> alex > asha > catherine

        final List<String> o2 = t.getInheritanceOrder();// 返回 ["king", "andy", "matthew", "alex", "asha", "catherine"]
        Assert.assertArrayEquals(new String[]{"king", "andy", "matthew", "alex", "asha", "catherine"},
            o2.toArray());
    }


}
