package org.streamAPI;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintCSVString {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("Apple","Mango","Bananna","grapes");
        String res = lst.stream()
                .collect(Collectors.joining(","));
        System.out.println(res);
    }
}
