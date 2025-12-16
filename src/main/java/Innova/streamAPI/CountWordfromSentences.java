package org.streamAPI;

import java.util.Arrays;
import java.util.List;

public class CountWordfromSentences {
    public static void main(String[] args) {
        String paragraph = "Java Stream API makes processing data easy";
        List<String> lst = Arrays.asList(paragraph.split(" "));
        long c = lst.stream()
                .count();
        System.out.println(c);
    }
}
