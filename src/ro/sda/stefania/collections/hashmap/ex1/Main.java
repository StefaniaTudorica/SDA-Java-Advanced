package ro.sda.stefania.collections.hashmap.ex1;

import com.sun.source.doctree.SeeTree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Write a program which creates a concordance of characters occurring in a string (i.e., which characters occur where in a string).
 * Read the string from the command line.
 * Ex: {d=[9], o=[4, 6], r=[7], W=[5], H=[0], l=[2, 3, 8], e=[1]}
 */

public class Main {
    public static void main(String[] args) {

        String testValue = "Hello world";
        Map<Character, Set<Integer>> map = new HashMap<>();

  //      char[] charArray = testValue.toCharArray();
   //     char mapKey = 0;
   //     for ( int i = 0; i < charArray.length; i++) {
  //          mapKey = charArray[i];
   //         int mapValue = i;
//            if (!map.containsKey(mapKey)) {
  //          }
 //           Set<Integer> set = new HashSet<>();
 //           map.put(mapKey, set);
 //       }

 //       map.get(mapKey).add(mapValue);


        char[] charArray = testValue.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char mapKey = charArray[i];
            int mapValue = i;

            map.putIfAbsent(mapKey, new HashSet<>());
            map.get(mapKey).add(mapValue);
        }



        System.out.println(map);
    }
}
