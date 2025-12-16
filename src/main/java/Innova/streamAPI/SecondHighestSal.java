package org.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestSal {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee(101, "John", "IT", 50000),
                new Employee(102, "Emma", "HR", 45000),
                new Employee(103, "Raj", "IT", 52000),
                new Employee(104, "Sara", "Finance", 60000),
                new Employee(105, "Akash", "HR", 48000)
        );


        double sal = empList.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0.0);

        System.out.println(sal);
    }
}
