package org.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class FindLongestString {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("Java", "Stream", "API", "Programming", "Code");
        String res = lst.stream()
                .max(Comparator.comparing(String::length))
                .orElse("");

        System.out.println(res);
    }




}
