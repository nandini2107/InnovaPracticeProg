package org.streamAPI;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedCharacter {
    public static void main(String[] args) {
        String str= "swiss";
        //by using hashmap
        Map<Character,Integer> map= new HashMap<>();
        char[] ch = str.toCharArray();
        for(char c :ch){
            //System.out.println(c);
            map.put(c, map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
        for(char c:ch) {
            if (map.get(c) == 1) {
                System.out.println(c);
            }
        }


        //by stream api



    }
}
