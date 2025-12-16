package org.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedList {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1,4,2,5,6,3);
        List<Integer> result = lst.stream()
                .sorted()
                .toList();
        System.out.println(result);
    }
}
