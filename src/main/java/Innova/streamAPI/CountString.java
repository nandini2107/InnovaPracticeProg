package org.streamAPI;

import java.util.Arrays;
import java.util.List;

public class CountString {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("Shishir", "Shreya","Nandini", "Anirudh","soumya");
        long count = lst.stream()
                .filter(n->!n.isEmpty() && (n.charAt(0) =='S'|| n.charAt(0) =='s'))
                .count();
        System.out.println(count);
    }
}
