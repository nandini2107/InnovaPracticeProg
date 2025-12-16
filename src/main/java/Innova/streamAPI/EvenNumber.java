package org.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1,2,3,4,5,6);
        List<Integer> result = lst.stream()
                .filter(n->n%2 ==0)
                .toList();
        System.out.println(result);

    }
}
