package com.raydya;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeImportance {

    private Map<Integer, Employee> map;
    private int importance = 0;

    public int getImportance(List<Employee> employees, int id) {
        this.map = employees.stream().collect(
            Collectors.toMap(
                e -> e.id,
                e -> e
            )
        );

        final Employee employee = map.get(id);
        importance += employee.importance;
        final List<Integer> subordinates = employee.subordinates;
        iterator(subordinates);

        return importance;
    }

    private void iterator(List<Integer> subordinates) {
        if (subordinates.isEmpty()) {
            return;
        }
        for (final Integer subordinate : subordinates) {
            final Employee e = map.get(subordinate);
            importance += e.importance;
            iterator(e.subordinates);
        }
    }

    public static class Employee {

        public int id;
        public int importance;
        public List<Integer> subordinates;
    }
}
