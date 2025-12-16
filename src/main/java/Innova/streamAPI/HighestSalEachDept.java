package org.streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class HighestSalEachDept {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee(101, "John", "IT", 50000),
                new Employee(102, "Emma", "HR", 45000),
                new Employee(103, "Raj", "IT", 52000),
                new Employee(104, "Sara", "Finance", 60000),
                new Employee(105, "Akash", "HR", 48000)
        );

        Map<String, Optional<Employee>> lst = empList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(lst);

    }
}
