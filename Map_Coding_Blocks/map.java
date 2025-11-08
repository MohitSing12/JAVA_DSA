package Map_Coding_Blocks;

import java.util.*;

public class map {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("A",10);
        map.put("B",20);
        map.put("C",30);
        map.put("D",40);
        map.put("E",50);
        map.put("A",100);
//        map.put(null,200);
        System.out.println(map);
//        System.out.println(map.get("B"));
//        System.out.println(map.containsKey("A"));
//        map.remove("C");
//        System.out.println(map);



 //TreeMap maintains the sorted order of the map
 //We can't insert null as a key in treemap because null can't be compared
        Map<String,Integer> map1=new TreeMap<>();
        map1.put("A",10);
        map1.put("B",20);
        map1.put("C",30);
        map1.put("D",40);
        map1.put("E",50);
        map1.put("A",100);
//        map1.put(null,200);
        System.out.println(map1);

        System.out.println("*******");
        //To iterate over a map:
        //1st method
//        Set<String> set=map1.keySet();
//        for(String x:set){
//            System.out.print(x+":"+map.get(x)+" ");
//        }

        //2nd Method
        for(String x:map1.keySet()){
            System.out.print(x+":"+map.get(x)+" ");
        }
        System.out.println();
        System.out.println("*******");

 //LinkedHashMap is implemented using Doubly Linked List
//LinkedHashMap maintains the order of insertion(The manner in which the user enters the key-value)
        Map<String,Integer> map2=new LinkedHashMap<>();
        map2.put("A",10);
        map2.put("B",20);
        map2.put("C",30);
        map2.put("D",40);
        map2.put("E",50);
        map2.put("A",100);
//        map2.put(null,200);
        System.out.println(map2);
    }
}
