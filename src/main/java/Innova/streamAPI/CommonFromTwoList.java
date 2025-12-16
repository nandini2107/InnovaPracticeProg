package org.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CommonFromTwoList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 6, 7);


        List<Integer> res = list1.stream()
                .filter(list2::contains)
                .toList();

        System.out.println(res);
        List<Integer> r = Stream.of(list1,list2)
                .flatMap(List::stream)
                .toList();
        System.out.println(r);


    }
}
