package org.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("java", "spring", "aws");
        List<String> result = lst.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(result);
    }
}
