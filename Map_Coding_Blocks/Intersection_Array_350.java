package Map_Coding_Blocks;

import java.util.ArrayList;
import java.util.HashMap;

public class Intersection_Array_350 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4};

        int[] arr=Intersection_arr( nums1,  nums2);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }


    public static int[] Intersection_arr(int[] arr1,int[] arr2){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(map.containsKey(arr1[i])){
                map.put(arr1[i],map.get(arr1[i])+1);
            }
            else{
                map.put(arr1[i],1);
            }

        }
        ArrayList<Integer> ll=new ArrayList<>();
        for(int i=0;i<arr2.length;i++){
            if(map.containsKey(arr2[i])){
                ll.add(arr2[i]);
                map.put(arr1[i],map.get(arr2[i])-1);
            }
        }
        int[] ans=new int[ll.size()];
        for(int i=0;i<ll.size();i++){
            ans[i]=ll.get(i);
        }

        return ans;
    }
}