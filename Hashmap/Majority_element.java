package Hashmap;

import java.util.HashMap;

public class Majority_element {
    public static void main(String[] args) {
        int []arr={1,1,2,2,1,2,2};
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int x:map.keySet()){
            if(map.get(x)>arr.length/2){
                System.out.println(x);
            }
        }

    }
}
