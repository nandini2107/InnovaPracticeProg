package org.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SalGreater {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee(101, "John", "IT", 50000),
                new Employee(102, "Emma", "HR", 45000),
                new Employee(103, "Raj", "IT", 52000),
                new Employee(104, "Sara", "Finance", 60000),
                new Employee(105, "Akash", "HR", 48000)
        );
             List<Employee> lst = empList.stream()
                .filter(n->n.getSalary()>50000)
                     .collect(Collectors.toList());

        System.out.println(lst);

    }
}
