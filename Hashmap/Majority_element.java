package Hashmap;

import java.util.HashMap;

public class Majority_element {
    public static void main(String[] args) {
        int []arr={1,1,2,2,1,2,2};
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){

            //getOrDefault outputs the value of the key entered otherwise it will return a default value passed by the user!!
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//            System.out.println(map.getOrDefault(arr[i],0));
        }
        for(int x:map.keySet()){
            if(map.get(x)>arr.length/2){
                System.out.println(x);
            }
        }

    }
}
