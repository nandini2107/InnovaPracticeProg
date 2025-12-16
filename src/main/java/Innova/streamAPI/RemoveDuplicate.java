package org.streamAPI;
import java.util.Arrays;
import  java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1,2,2,3,4,5,3,1);
        List<Integer> result = lst.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(result); //(1,2,3,4,5)


        //output = 4,5

        List<Integer> finalRes = result.stream()
                .skip(result.toArray().length -2)
                //.filter(n->n>3)
                .toList();
        System.out.println(finalRes);
    }
}
