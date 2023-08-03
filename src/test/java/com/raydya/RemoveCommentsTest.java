package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class RemoveCommentsTest {

    @Test
    public void test1() {
        final RemoveComments solution = new RemoveComments();
        final List<String> output = solution.removeComments(
            new String[]{"/*Test program */", "int main()", "{ ", "  // variable declaration ", "int a, b, c;",
                "/* This is a test", "   multiline  ", "   comment for ", "   testing */", "a = b + c;", "}"}
        );

        Assert.assertArrayEquals(
            new String[]{"int main()", "{ ", "  ", "int a, b, c;", "a = b + c;", "}"},
            output.toArray()
        );
    }

    @Test
    public void test2() {
        final RemoveComments solution = new RemoveComments();
        final List<String> output = solution.removeComments(
            new String[]{"a/*comment", "line", "more_comment*/b"}
        );

        Assert.assertArrayEquals(
            new String[]{"ab"},
            output.toArray()
        );
    }

    @Test
    public void test3() {
        final RemoveComments solution = new RemoveComments();
        final List<String> output = solution.removeComments(
            new String[]{"struct Node{", "    /*/ declare members;/**/", "    int size;", "    /**/int val;", "};"}
        );

        Assert.assertArrayEquals(
            new String[]{"struct Node{", "    ", "    int size;", "    int val;", "};"},
            output.toArray()
        );
    }

    @Test
    public void test4() {
        final RemoveComments solution = new RemoveComments();
        final List<String> output = solution.removeComments(
            new String[]{
                "main() {", "/* here is commments", "  // still comments */", "   double s = 33;", "   cout << s;", "}"
            }
        );

        Assert.assertArrayEquals(
            new String[]{"main() {", "   double s = 33;", "   cout << s;", "}"},
            output.toArray()
        );
    }

    @Test
    public void test5() {
        final RemoveComments solution = new RemoveComments();
        final List<String> output = solution.removeComments(
            new String[]{
                "void func(int k) {", "// this function does nothing /*", "   k = k*2/4;", "   k = k/2;*/", "}"
            }
        );

        Assert.assertArrayEquals(
            new String[]{
                "void func(int k) {", "   k = k*2/4;", "   k = k/2;*/", "}"
            },
            output.toArray()
        );
    }

    @Test
    public void test6() {
        final RemoveComments solution = new RemoveComments();
        final List<String> output = solution.removeComments(
            new String[]{
                "a//*b/*/c", "blank", "d/*/e/*/f"
            }
        );

        Assert.assertArrayEquals(
            new String[]{
                "a", "blank", "df"
            },
            output.toArray()
        );
    }
}
