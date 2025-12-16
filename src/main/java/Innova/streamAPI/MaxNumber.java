package org.streamAPI;

import java.util.Arrays;
import java.util.List;

public class MaxNumber {
    public static void main(String[] args) {
        List<Integer> lst= Arrays.asList(1,20,3,12,8);
        int maxNo = lst.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);
        System.out.println(maxNo);
    }
}
