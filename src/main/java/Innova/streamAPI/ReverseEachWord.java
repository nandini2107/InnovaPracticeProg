package org.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] args) {
        String s = "Hello World from Java";
        String res1 = Arrays.stream(s.split(" "))
                .map(a->new StringBuilder(a).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(res1);





        String rev = "";

        for(int i=s.length()-1;i>0;i--){
            rev= rev + s.charAt(i);
        }
        System.out.println(rev);

    }
}
