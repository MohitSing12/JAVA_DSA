package Hashmap;
//Print all the elements with their frequencies
//Eg: arr[]={11,25,11,25,5}=> o/p is: 11:2  ,25:2 ,5:1

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Duplicates_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println("key: "+entry.getKey()+" value "+entry.getValue());
        }
    }
}
