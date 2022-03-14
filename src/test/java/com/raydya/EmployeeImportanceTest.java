package com.raydya;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeImportanceTest {

    @Test
    public void test1() {
        final EmployeeImportance.Employee e1 = new EmployeeImportance.Employee();
        e1.id = 1;
        e1.importance = 5;
        e1.subordinates = Arrays.asList(2, 3);

        final EmployeeImportance.Employee e2 = new EmployeeImportance.Employee();
        e2.id = 2;
        e2.importance = 3;
        e2.subordinates = Collections.emptyList();

        final EmployeeImportance.Employee e3 = new EmployeeImportance.Employee();
        e3.id = 3;
        e3.importance = 3;
        e3.subordinates = Collections.emptyList();

        final List<EmployeeImportance.Employee> employees = Arrays.asList(e1, e2, e3);

        final EmployeeImportance solution = new EmployeeImportance();
        final int output = solution.getImportance(employees, 1);

        Assert.assertEquals(11, output);
    }

    @Test
    public void test2() {
        final EmployeeImportance.Employee e1 = new EmployeeImportance.Employee();
        e1.id = 1;
        e1.importance = 5;
        e1.subordinates = Arrays.asList(2, 3);

        final EmployeeImportance.Employee e2 = new EmployeeImportance.Employee();
        e2.id = 2;
        e2.importance = 3;
        e2.subordinates = Collections.singletonList(4);

        final EmployeeImportance.Employee e3 = new EmployeeImportance.Employee();
        e3.id = 3;
        e3.importance = 4;
        e3.subordinates = Collections.emptyList();

        final EmployeeImportance.Employee e4 = new EmployeeImportance.Employee();
        e4.id = 4;
        e4.importance = 1;
        e4.subordinates = Collections.emptyList();

        final List<EmployeeImportance.Employee> employees = Arrays.asList(e1, e2, e3, e4);

        final EmployeeImportance solution = new EmployeeImportance();
        final int output = solution.getImportance(employees, 1);

        Assert.assertEquals(13, output);
    }
}
