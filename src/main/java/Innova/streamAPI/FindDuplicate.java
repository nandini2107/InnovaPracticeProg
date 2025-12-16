package org.streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 3);
        Set<Integer> unique = new HashSet<>();

        Set<Integer> res = lst.stream()
                .filter(n -> !unique.add(n))
                .collect(Collectors.toSet());
        System.out.println(res);









    }
}
