package org.streamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentWise {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee(101, "John", "IT", 50000),
                new Employee(102, "Emma", "HR", 45000),
                new Employee(103, "Raj", "IT", 52000),
                new Employee(104, "Sara", "Finance", 60000),
                new Employee(105, "Akash", "HR", 48000)
        );

        Map<String, List<Employee>> byDept= empList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(byDept);

        //{Finance=[Employee{id=104, name='Sara', department='Finance', salary=60000.0}],
        // HR=[Employee{id=102, name='Emma', department='HR', salary=45000.0},
        // Employee{id=105, name='Akash', department='HR', salary=48000.0}],
        // IT=[Employee{id=101, name='John', department='IT', salary=50000.0},
        // Employee{id=103, name='Raj', department='IT', salary=52000.0}]}

    }
}
